package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.ReplaceMiddle;

import static org.junit.Assert.*;

public class ReplaceMiddleTest {
    @Test
    public void replaceMiddle() throws Exception {
        ReplaceMiddle runner = new ReplaceMiddle();
        assertArrayEquals(new int[] {7, 2, 7, 10, 7}, runner.replaceMiddle(new int[] {7, 2, 2, 5, 10, 7}));
    }

}