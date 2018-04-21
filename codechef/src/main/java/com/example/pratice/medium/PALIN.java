package com.example.pratice.medium;
import java.util.Scanner;
public class PALIN {

    static int s = 1000100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char[] ch = new char[1000100];

        scanner.nextLine();

        while (t-- > 0) {
            String k = scanner.nextLine();
            s = 1000100;
            for (int i = k.length() - 1; i >= 0; i--) {
                ch[--s] = k.charAt(i);
            }

            System.out.println(solve(ch));
        }
    }

    private static String solve(char[] ch) {
        int len = ch.length;
        if (ch[len - 1] < '9') ch[len - 1]++;
        else {
            ch[len-1] = '0';
            carry(ch, len -1);
        }
        for (int i = 0; i < (len-s)/2 ; i++) {
            if (ch[i+s] > ch[len-i-1]) {
                ch[len-i-1] = ch[+s];
            } else {
                if (i+s+1 == len-1-i) {
                    int n = Integer.parseInt(""+ch[i+s]+ch[len-i-1]);
                    for(;n<=99 && n/10 != n%10;n++) {
                        ch[i+s]= ch[len-i-1] = Integer.toString(n).charAt(0);
                    }
                } else {
                    ch[len-i-1] = ch[i+s];
                    carry(ch, len-i-1-1);
                    ch[len-i-1] = ch[i+s];
                }
            }
        }
        return new String(ch, s, len-s);
    }

    private static void carry(char[] ch, int i) {
        for (; i >= s; i--) {
            if (ch[i] < '9') {
                ch[i]++;
                break;
            }
            ch[i] = '0';
        }
        if (i < s) ch[--s] = '1';
    }
}
