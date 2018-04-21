package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.SumUpNumbers;

import static org.junit.Assert.*;

public class SumUpNumbersTest {
    @Test
    public void sumUpNumbers() throws Exception {
        SumUpNumbers runner = new SumUpNumbers();
        assertEquals(14, runner.sumUpNumbers("2 apples, 12 oranges"));
        assertEquals(123450, runner.sumUpNumbers("123450"));
        assertEquals(0, runner.sumUpNumbers("Your payment method is invalid"));
    }

}