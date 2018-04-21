package videv.spoj.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class BTCKTest {
    @Test
    public void permute() throws Exception {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 200;
        BTCK.solve(b, a, 0, a.length - 1, k);
        assertArrayEquals(new int[] {2, 6, 8, 9, 7, 5, 4, 3, 1, 0}, b);
    }

}