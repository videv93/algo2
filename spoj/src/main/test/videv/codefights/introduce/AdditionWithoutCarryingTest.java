package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.AdditionWithoutCarrying;

import static org.junit.Assert.*;

public class AdditionWithoutCarryingTest {
    @Test
    public void additionWithoutCarrying() throws Exception {
        AdditionWithoutCarrying runner = new AdditionWithoutCarrying();
        assertEquals(231, runner.additionWithoutCarrying(110,121));
        assertEquals(111231, runner.additionWithoutCarrying(111110,121));
        assertEquals(0, runner.additionWithoutCarrying(9,1));
        assertEquals(4, runner.additionWithoutCarrying(92,12));
        assertEquals(0, runner.additionWithoutCarrying(92,18));
    }

    @Test
    public void additionWithCarrying() throws Exception {
        AdditionWithoutCarrying runner = new AdditionWithoutCarrying();
        assertEquals(-1, runner.additionWithCarrying(10,11));
    }

}