package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.ExtractEachKth;

import static org.junit.Assert.*;

public class ExtractEachKthTest {
    @Test
    public void testExtractEachKth() {
        ExtractEachKth extractEachKth = new ExtractEachKth();
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(new int[] {1, 2, 4, 5, 7, 8, 10}, extractEachKth.extractEachKth(inputArray, 3));
        assertArrayEquals(new int[] {}, extractEachKth.extractEachKth(new int[] {1, 1, 1, 1, 1}, 1));
        assertArrayEquals(new int[] {1,1,1,1}, extractEachKth.extractEachKth(new int[] {1, 2, 1, 2, 1, 2, 1, 2}, 2));
    }

}