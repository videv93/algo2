package com.example.pratice.medium;

import java.util.*;

public class ONEKING {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Point> points = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points.add(new Point(x, y));
            }
            Collections.sort(points, (o1, o2) -> o1.getX() - o2.getX());

            int index = 0, ans = 0;
            while (index < points.size() - 1) {
                Point start = points.get(index);
                Point end = points.get(++index);
                while (end.getX() <= start.getY()) {
                    end = points.get(++index);
                }
                ans += 1;
            }

            // if end is a last index of array, add 1 to answer
            if (index == points.size() - 1) {
                ans += 1;
            }

            System.out.println(ans);
        }

    }
}
