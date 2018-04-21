package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.DeleteDigit;

import static org.junit.Assert.*;

public class DeleteDigitTest {
    @Test
    public void deleteDigit() throws Exception {
        DeleteDigit runner = new DeleteDigit();
        assertEquals(52, runner.deleteDigit(152));
        assertEquals(101, runner.deleteDigit(1001));
    }

    @Test
    public void deleteOne() throws Exception {
        DeleteDigit runner = new DeleteDigit();
        assertEquals(1, runner.deleteOne(12, 2));
        assertEquals(2, runner.deleteOne(12, 1));
        assertEquals(13, runner.deleteOne(123, 2));
        assertEquals(12346789, runner.deleteOne(123456789, 5));
    }

    @Test
    public void length() throws Exception {
        DeleteDigit runner = new DeleteDigit();
        assertEquals(1, runner.length(2));
        assertEquals(2, runner.length(11));
        assertEquals(3, runner.length(111));
    }

}