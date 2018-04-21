package com.example.arcade.graphs;

import java.util.*;

public class Main<T> {

    String deepToString(boolean[][] a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            builder.append(Arrays.toString(a[i]) + "\n");
        }
        return builder.toString();
    }
    boolean newRoadSystem(boolean[][] roadRegister) {
        List<Map<Integer,Integer>> lst = new ArrayList<>();
        for (int i = 0; i < roadRegister.length; i++) {
            lst.add(new HashMap<>());
        }
        for (int i = 0; i < roadRegister.length; i++) {
            Map<Integer, Integer> inout = new HashMap<>();
            int out = 0;
            for (int j = 0; j < roadRegister[i].length; j++) {
                if (roadRegister[i][j]) {

                    // increate out of current city to 1
                    out++;

                    // increase in road to 1
                    int curIn = lst.get(j).get(1) != null ? lst.get(j).get(1) : 0;
                    lst.get(j).put(1, ++curIn);
                }
            }
            inout.put(0, out);
            inout.put(1, lst.get(i).get(1) != null ? lst.get(i).get(1) : 0);
            lst.set(i, inout);
        }

        for (int i = 0; i < lst.size(); i++) {
            if (!lst.get(i).get(0).equals(lst.get(i).get(1))) {
                return false;
            }
        }
        return true;
    }

    int[][] roadsBuilding(int cities, int[][] roads) {
        boolean[][] graph = new boolean[cities][cities];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new boolean[cities];
            for  (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = false;
            }
        }
        for (int i = 0; i < roads.length; i++) {
            graph[roads[i][0]][roads[i][1]] = true;
            graph[roads[i][1]][roads[i][0]] = true;
        }

        List<int[]> lst = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (i != j && !graph[i][j]) {
                    lst.add(new int[] {i, j});
                    graph[i][j] = graph[j][i] = true;
                }
            }
        }

        return lst.toArray(new int[][] {});
    }

    boolean efficientRoadNetwork(int n, int[][] roads) {
        boolean[][] graph = new boolean[n][n];
        for (int i = 0; i < roads.length; i++) {
            graph[i] = new boolean[n];
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = false;
            }
        }

        for (int i = 0; i < roads.length; i++) {
            graph[roads[i][0]][roads[i][1]] = true;
            graph[roads[i][1]][roads[i][0]] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // check if we can move from i to j
                // if not return false

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main<Boolean> main = new Main<>();

        boolean[][] roadRegister = new boolean[][] {
                {false, true,  false, false},
                {false, false, true,  false},
                {true,  false, false, true},
                {false, false, true,  false}
        };

        boolean[][] roadRegister2 = new boolean[][] {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

//        main.newRoadSystem(roadRegister2);

        int cities = 4;
        int[][] roads = new int[][] {
                {0,1},
                {1,2},
                {2,0}
        };

        main.roadsBuilding(cities, roads);
    }
}
