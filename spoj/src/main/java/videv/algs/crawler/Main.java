package videv.algs.crawler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String regex = "List of cities in ([\\w|\\s]+)";
    private static final String prefix = "https://en.wikipedia.org";
    private static final String[] colName = new String[] {
            "Name",
            "City / Town",
            "City",
            "City name",
            "City (Special Ward)"
    };
    private static int success = -1;
    private static int fail = -1;
    private static Pattern r = Pattern.compile(regex);
    public static void main(String[] args) throws IOException {
        List<Country> countries = new ArrayList<>();
        Document doc = Jsoup.connect(prefix + "/wiki/Lists_of_cities_by_country").get();
        Elements content = doc.getElementsByClass("mw-parser-output");
        if (content != null && content.size() > 0) {
            Element data0 = content.first();
            Elements as = data0.select("a");
            for (int i = 0; i < as.size(); i++) {
                Element a = as.get(i);
                Attributes attrs = a.attributes();
                Country country = new Country();
                boolean flag = false;
                for (Attribute attr : attrs) {
                    if (attr.getKey().equalsIgnoreCase("href")) {
                        country.setHref(prefix + attr.getValue());
                    } else if (attr.getKey().equalsIgnoreCase("title")){
                        Matcher m = r.matcher(attr.getValue());
                        if (m.find()) {
                            String name = m.group(1);
                            country.setName(name);
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    updateCitiesForCountry(country);
                    countries.add(country);
                }
            }
        }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(String.format("Finish craw with %d total: %d success, %d fail", success + fail, success, fail));
        System.out.println(mapper.writeValueAsString(countries));
    }

    private static boolean contains(String[] cities, String city) {
        boolean b = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(city)) {
                b = true;
                break;
            }
        }
        return b;
    }

    private static void updateCitiesForCountry(Country country) throws IOException {
        try {
            List<String> lst = new ArrayList<>();
            Document doc = Jsoup.connect(country.getHref()).get();
            Elements content = doc.select("table.wikitable");
            if (content != null && content.size() > 0) {
                Element data = content.first();
                Elements ths = data.getElementsByTag("th");
                int col = -1;
                while (++col < ths.size() && !contains(colName, ths.get(col).html()));
                if (col > -1 && col < ths.size()) {
                    Elements cities = data.select(String.format("tr td:nth-child(%d)", ++col));
                    for (Element city : cities) {
                        Elements as = city.getElementsByTag("a");
                        if (as != null && as.size() > 0) {
                            Element a = as.first();
                            for (Attribute attr : a.attributes()) {
                                if (attr.getKey().equalsIgnoreCase("title")) {
                                    lst.add(attr.getValue());
                                }
                            }
                        }

                    }
                }
            }
            if (lst.size() > 0) {
                System.out.println(String.format("Update cities for country %s", country.getName()));
                country.setCities(lst);
                ++success;
            } else {
                System.err.println(String.format("Error when update cities for country %s with url %s", country.getName(), country.getHref()));
                ++fail;
            }

        } catch (Exception e) {
            System.err.println(String.format("Error when update cities for country %s", country.getName()));
            ++fail;
        }
    }


    static class Country {

        String name;
        String href;
        List<String> cities;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCities() {
            return cities;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public void setCities(List<String> cities) {
            this.cities = cities;
        }
    }
}
