package com.example.zco;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Solution for ZCO14001 problem
 * @see
 *      <a href="https://www.codechef.com/ZCOPRAC/problems/ZCO14001">https://www.codechef.com/ZCOPRAC/problems/ZCO14001</a>
 * @author
 *      vi.tt
 */
public class ZCO14001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.nextLine();

        String[] commandStrs = scanner.nextLine().split(" ");
        int[] commands = Stream.of(commandStrs).mapToInt(Integer:: parseInt).toArray();

        int position = 0;
        boolean hasBox = false;
        boolean quit = false;

        for (int i = 0; i < commands.length; i++) {

            if (quit) {
                break;
            }

            switch (commands[i]) {
                case 1:
                    // move left
                    position -= 1;
                    if (position < 0)
                        position = 0;
                    break;
                case 2:
                    // move right
                    position += 1;
                    if (position > arr.length - 1)
                        position = arr.length - 1;
                    break;
                case 3:
                    // pick up box
                    if (hasBox == false && arr[position] > 0) {
                        arr[position]--;
                        hasBox = true;
                    }
                    break;
                case 4:
                    // drop box
                    if (hasBox == true && arr[position] < H) {
                        arr[position]++;
                        hasBox = false;
                    }
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
