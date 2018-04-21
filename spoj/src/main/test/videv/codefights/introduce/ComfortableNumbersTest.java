package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.ComfortableNumbers;

import static org.junit.Assert.*;

public class ComfortableNumbersTest {
    @Test
    public void comfortableNumbers() throws Exception {
        ComfortableNumbers runner = new ComfortableNumbers();
        assertEquals(2, runner.comfortableNumbers(10, 12));
        assertEquals(20, runner.comfortableNumbers(1, 9));
    }

    @Test
    public void pair() throws Exception {
        ComfortableNumbers runner = new ComfortableNumbers();
        assertEquals(190, runner.pair(10, 20));
    }

}