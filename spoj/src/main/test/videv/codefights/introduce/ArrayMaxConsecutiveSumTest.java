package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.ArrayMaxConsecutiveSum;

import static org.junit.Assert.*;

public class ArrayMaxConsecutiveSumTest {
    @Test
    public void arrayMaxConsecutiveSum() throws Exception {
        ArrayMaxConsecutiveSum runner = new ArrayMaxConsecutiveSum();
        assertEquals(8, runner.arrayMaxConsecutiveSum(new int[] {2, 3, 5, 1, 6}, 2));
    }

}