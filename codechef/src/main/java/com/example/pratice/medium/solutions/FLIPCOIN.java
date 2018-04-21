package com.example.pratice.medium.solutions;

import java.util.Arrays;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class FLIPCOIN {
    public static void main(String[] args) {
        final FlipCoinInputReader inputReader = new FlipCoinInputReader(System.in);
        final int n = inputReader.readInt(), q = inputReader.readInt();
        final StringBuilder stringBuilder = new StringBuilder();
        final SegmentTree segmentTree = new SegmentTree(n);
        for (int i = 0; i < q; i++) {
            if (inputReader.readInt() == 0) {
                segmentTree.updateTree(inputReader.readInt() + 1, inputReader.readInt() + 1);
            } else {
                stringBuilder.append(segmentTree.handleQuery(inputReader.readInt() + 1, inputReader.readInt() + 1))
                        .append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}

class SegmentTree {
    private final long a[];
    private int digit, n;
    private final boolean flipped[];

    public SegmentTree(final int n) {
        this.n = n;
        digit = 0;
        while (n > (1 << digit)) {
            digit++;
        }
        this.a = new long[1 << (digit + 1)];
        buildTree(1);
        flipped = new boolean[this.a.length];
    }

    private long findResult(final int node,
            final int left,
            final int right,
            final int leftMostIndex,
            final int rightMostIndex) {
        if (left <= right) {
            if (leftMostIndex >= left && rightMostIndex <= right) {
                return a[node];
            } else if ((left >= leftMostIndex && rightMostIndex >= left) || (right >= leftMostIndex && rightMostIndex >= right)) {
                if (flipped[node]) {
                    flip(node << 1, (rightMostIndex - leftMostIndex + 1) >> 1);
                    flip((node << 1) + 1, (rightMostIndex - leftMostIndex + 1) >> 1);
                    flipped[node] = false;
                }
                return findResult(node << 1, left, right, leftMostIndex, (rightMostIndex + leftMostIndex) >> 1)
                        + findResult((node << 1) + 1,
                        left,
                        right,
                        ((rightMostIndex + leftMostIndex) >> 1) + 1,
                        rightMostIndex);
            }
        }
        return 0;
    }

    private void flip(final int index, final int range) {
        flipped[index] = !flipped[index];
        a[index] = range - a[index];
    }

    private long buildTree(final int node) {
        if (node >= (1 << digit)) {
            return a[node];
        } else {
            return a[node] = buildTree(node << 1) + buildTree((node << 1) + 1);
        }
    }

    public void updateTree(final int l, final int r) {
        update(1, (1 << digit) + l - 1, (1 << digit) + r - 1, 1 << digit, (1 << (digit + 1)) - 1);
    }

    private void update(final int node,
            final int left,
            final int right,
            final int leftMostIndex,
            final int rightMostIndex) {
        if (left <= right) {
            if (leftMostIndex >= left && rightMostIndex <= right) {
                flip(node, rightMostIndex - leftMostIndex + 1);
            } else if ((left >= leftMostIndex && rightMostIndex >= left) || (right >= leftMostIndex && rightMostIndex >= right)) {
                if (flipped[node]) {
                    flip(node << 1, (rightMostIndex - leftMostIndex + 1) >> 1);
                    flip((node << 1) + 1, (rightMostIndex - leftMostIndex + 1) >> 1);
                    flipped[node] = false;
                }
                update(node << 1, left, right, leftMostIndex, (rightMostIndex + leftMostIndex) >> 1);
                update((node << 1) + 1, left, right, ((rightMostIndex + leftMostIndex) >> 1) + 1, rightMostIndex);
                if (node < (1 << digit)) {
                    a[node] = a[node << 1] + a[(node << 1) + 1];
                }
            }
        }
    }

    public long handleQuery(final int l, final int r) {
        return findResult(1, (1 << digit) + l - 1, (1 << digit) + r - 1, 1 << digit, (1 << (digit + 1)) - 1);
    }


    @Override
    public String toString() {
        return "SegmentTree{" +
                "a=" + Arrays.toString(a) +
                ", flipped=" + Arrays.toString(flipped) +
                '}';
    }
}

class FlipCoinInputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];

    private int curChar;

    private int numChars;

    public FlipCoinInputReader(InputStream stream) {
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

    public long readLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}
