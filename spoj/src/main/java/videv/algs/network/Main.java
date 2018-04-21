package videv.algs.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] ports = new int[10001];
        for (int i = 1000; i < 10001; i++) {
            ports[i] = i;
        }
        int idx = 1000;
        List<Integer> lst = new ArrayList<>();
        while (idx < ports.length) {
            int port = foo(ports, idx);
            if (port >= -1) {
                lst.add(port);
            }
            idx++;
        }
        System.out.println(Arrays.toString(lst.toArray()));
    }

    private static int foo(int[] ports, int idx) throws IOException {
        final String host = "10.0.1.42";
        int port = ports[idx];
        String url = "https://facebook.github.io/react-native/movies.json";

        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        URLConnection u = new URL(url).openConnection(proxy);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(u.getInputStream()))) {
            StringBuilder sb = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }

            String response = sb.toString();
            if (response != null && response.length() > 1) {
                System.out.println(String.format("find a port %d", port));
                return port;
            }
            in.close();
        } catch (Exception e) {
            System.err.println(String.format("connection refused in port %d", port));;
        }
        return -1;
    }
}
