package com.example.pratice.easy.solutions;

import java.io.*;
import java.util.InputMismatchException;

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String readString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public String next() {
        return readString();
    }

    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }

    public void printLine(Object...objects) {
        print(objects);
        writer.println();
    }

    public void printIntegerArray(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            writer.print(a[i] + " ");
        }
        writer.println();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }

}

class IOUtils {

    public static int[] readIntArray(InputReader in, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = in.readInt();
        return array;
    }

}

class DiscrepanciesInVL {

    /**
     * Merge 3  array in sort order
     * @param a
     * @param b
     * @param c
     */
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0 , j = 0 , k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if(i < a.length){
            while(i < a.length){
                c[k] = a[i];
                k++;
                i++;
            }
        }
        if(j < b.length){
            while(j < b.length){
                c[k] = b[j];
                k++;
                j++;
            }
        }
    }

    /**
     * Idea: interate over all element in array. Check if exist 2 or 3 element equal, put it to output array and jump to next.
     * Then output result array
     * @param out
     * @param a
     * @param b
     * @param c
     */
    public static void firstApproach(OutputWriter out, int[] a, int[] b, int[] c){
        int[] ab = new int[a.length + b.length];
        int[] abc = new int[a.length + b.length + c.length];
        merge(a, b, ab);
        merge(ab, c, abc);
        int i = 0, k = 0, count = 0;
        int[] output = new int[abc.length];

        while(i < abc.length){
            if(i+1 < abc.length && abc[i] != abc[i+1]){
                i++;
            } else if(i+1 < abc.length && abc[i] == abc[i+1]){
                count++;
                output[k] = abc[i];
                k++;
                if(i+2 < abc.length && abc[i] == abc[i+2]){
                    i += 3;
                } else if(i+2 < abc.length && abc[i] != abc[i+2]){
                    i += 2;
                }
            } else {
                i++;
            }
        }
        out.printLine(count);
        for(Integer element : output){
            if(element != 0){
                out.printLine(element);
            } else {
                break;
            }
        }
        out.flush();
        out.close();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        int n1 = in.readInt();
        int n2 = in.readInt();
        int n3 = in.readInt();
        int[] a = IOUtils.readIntArray(in, n1);
        int[] b = IOUtils.readIntArray(in, n2);
        int[] c = IOUtils.readIntArray(in, n3);
        firstApproach(out, a, b, c);
    }
}