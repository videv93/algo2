package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.SquareDigitsSequence;

import static org.junit.Assert.*;

public class SquareDigitsSequenceTest {
    @Test
    public void squareDigitsSequence() throws Exception {
        SquareDigitsSequence runner = new SquareDigitsSequence();
        assertEquals(9, runner.squareDigitsSequence(16));
        assertEquals(2, runner.squareDigitsSequence(1));
        assertEquals(4, runner.squareDigitsSequence(103));
    }

    @Test
    public void sumSquareDigits() throws Exception {
        SquareDigitsSequence runner = new SquareDigitsSequence();
        assertEquals(37, runner.sumSquareDigits(16 ));
        assertEquals(145, runner.sumSquareDigits(89 ));
    }

}