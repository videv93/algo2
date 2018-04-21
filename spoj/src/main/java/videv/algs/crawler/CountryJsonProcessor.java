package videv.algs.crawler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CountryJsonProcessor {
    private static final String prefix = "https://en.wikipedia.org";
    private static final String filePrefix = "/home/local/SUTRIXMEDIA1/vi.tt/Desktop/countries-data/coutriesv1/";
    private static final String titlePrefix = "List of";

    public static void main(String[] args) throws InterruptedException {

//        process3("Bhutan", "/wiki/List_of_cities_in_Benin", 7);
//        process3("Bulgaria", "/wiki/List_of_cities_and_towns_in_Bulgaria", 21);
//        process3("Burkina Faso", "/wiki/List_of_cities_in_Burkina_Faso", 7);
//        process3("Burundi", "/wiki/List_of_cities_in_Burundi", 7);
//        process3("Cambodia", "/wiki/List_of_cities_in_Cambodia", 2);
//        process3("Cameroon", "/wiki/List_of_municipalities_of_Cameroon", 3);
//        process3("Canada", "/wiki/List_of_cities_in_Canada", 1);
//        process3("Cape Verde", "/wiki/List_of_cities_in_Cape_Verde", 2);
//        process3("Central African Republic", "/wiki/List_of_cities_in_the_Central_African_Republic", 42);
        process3("Chad", "/wiki/List_of_cities_in_Chad", 42);
    }

    private static int process3(String country, String url, int crawMethod) {
        try {
            // get file from path
            final String folderPath = filePrefix + country;
            try (PrintWriter print = new PrintWriter(folderPath + "/" + "cities.txt")) {
                Elements cities = getCityElements(url, crawMethod);
                if (cities != null && !cities.isEmpty()) {
                    System.out.println(String.format("Updated cities for %s with link %s", country, prefix + url));
                    for (Element city : cities) {
                        print.println(city.html());
                    }
                    return 1;
                } else {
                    System.err.println(String.format("Error when updated cities for %s with link %s", country, prefix + url));
                    return -1;
                }

            }
        } catch (Exception e) {
            System.err.println(String.format("Error when updated cities for %s with link %s", country, prefix + url));
            return -1;
        }
    }

    private static Elements getCityElements(String url, int method) throws IOException {
        Elements cities = null;
        Document doc = Jsoup.connect(prefix + url).get();
        if (method == 11) {
            Elements content = doc.select("table.wikitable");
            cities = content.select(String.format("tr td:nth-child(%d) a", 1));
        } else if (method == 12) {
            Elements content = doc.select("table.wikitable");
            cities = content.select(String.format("tr td:nth-child(%d) a", 2));
        }  else if (method == 13) {
            Element content = doc.select("table.wikitable").first();
            cities = content.select(String.format("tr td:nth-child(%d) a", 3));
        } else if (method == 2) {
            Elements content = doc.getElementsByClass("div-col");
            cities = content.select("a");
        } else if (method == 3) {
            Element content = doc.select("ul").first();
            cities = content.select("a");
        } else if (method == 41) {
            Elements content = doc.getElementsByClass("mw-parser-output");
            cities = content.select("ol a");
        } else if (method == 42) {
            Elements content = doc.getElementsByClass("mw-parser-output");
            cities = content.select("ul a");
        }

        return cities;
    }

    private static void process5() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            final String filePrefix = "/home/local/SUTRIXMEDIA1/vi.tt/Desktop/countries-data/coutriesv1/";
            File countriesFile = new File(filePrefix + "countries.json");
            JsonNode countries = mapper.readTree(countriesFile);

            for (JsonNode country: countries) {
                String name = country.get("name").asText();
                String url = country.get("url").asText();
                int crawMethod = country.get("crawMethod").asInt();
                if (crawMethod == -1) {
                    int b = process3(name, url, crawMethod);
                    ((ObjectNode)country).put("crawMethod", b);
                }
            }
            mapper.writeValue(countriesFile, countries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void process4() {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Lists_of_cities_by_country").get();
            Elements as = doc.select("a");

            ObjectMapper mapper = new ObjectMapper();
            final String filePrefix = "/home/local/SUTRIXMEDIA1/vi.tt/Desktop/countries-data/coutriesv1/";
            File countriesFile = new File(filePrefix + "countries.json");
            JsonNode countries = mapper.readTree(countriesFile);
            for (JsonNode country : countries) {
                ((ObjectNode)country).put("url", getUrlOfCountry(as, country.get("name").asText()));
            }

            mapper.writeValue(countriesFile, countries);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getUrlOfCountry(Elements as, String name) {
        for (Element a : as) {
            String title = a.attr("title");
            String html = a.html();
            if (html.indexOf(titlePrefix) != -1 && title.indexOf(name) != -1) {
                return a.attr("href");
            }
        }
        return "";
    }



    private static void process2() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            final String filePrefix = "/home/local/SUTRIXMEDIA1/vi.tt/Desktop/countries-data/coutriesv1/";
            JsonNode countries = mapper.readTree(new File(filePrefix + "countries.json"));
            for (JsonNode country: countries) {
                String name = country.get("name").asText();
                String code = country.get("code").asText();

                String folderPath = filePrefix + name;
//                Path newFolderPath = Paths.get(folderPath);
//                Files.createDirectory(newFolderPath);

//                String filePath = folderPath + "/" + "cities.json";
//                Path newFilePath = Paths.get(filePath);
//                Files.createFile(newFilePath);

                String fileTxtPath = folderPath + "/" + "cities.txt";
                Path newFileTxtPath = Paths.get(fileTxtPath);
                Files.createFile(newFileTxtPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void process1() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            final String filePrefix = "/home/local/SUTRIXMEDIA1/vi.tt/Desktop/countries-data/coutriesv1/";
            JsonNode countries = mapper.readTree(new File(filePrefix + "countries.json"));
            JsonNode cities = mapper.readTree(new File(filePrefix + "cities.json"));

            List<Country> countryList = new ArrayList<>();
            for (JsonNode country: countries) {
                String name = country.get("name").asText();
                String code = country.get("code").asText();
                countryList.add(new Country( name, code));
            }

            Collections.sort(countryList, new Comparator<Country>() {
                @Override
                public int compare(Country o1, Country o2) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            });

            Map<String, List<String>> map = new TreeMap<>();
            for (int i = 0; i < countryList.size(); i++) {
                Country country = countryList.get(i);
                Set<String> citiesSet = getCities(cities, country.getCode());
                List<String> citiesLst = new ArrayList<>();
                citiesLst.addAll(citiesSet);
                Collections.sort(citiesLst, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareToIgnoreCase(o2);
                    }
                });
                country.setCities(citiesLst);
                map.put(country.getName(), country.getCities());
            }
            File resultFile = new File(filePrefix + "countries-update.json");
            mapper.writeValue(resultFile, map);

            JsonNode countriesUpdate = mapper.readTree(new File(filePrefix + "countries-update.json"));
            System.out.println("");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Set<String> getCities(JsonNode cities, String code) {
        Set<String> st = new HashSet<>();
        for (JsonNode city : cities) {
            String country = city.get("country").asText();
            if (code.equalsIgnoreCase(country)) {
                st.add(city.get("name").asText());
            }
        }
        return st;
    }

    static class Country {

        String name;
        String code;
        List<String> cities;

        public Country(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public List<String> getCities() {
            return cities;
        }

        public void setCities(List<String> cities) {
            this.cities = cities;
        }
    }
}
