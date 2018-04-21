package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.Rounders;

import static org.junit.Assert.*;

public class RoundersTest {
    @Test
    public void rounders() throws Exception {
        Rounders runner = new Rounders();
        assertEquals(20, runner.rounders(15));
        assertEquals(1000, runner.rounders(1234));
        assertEquals(10, runner.rounders(10));
        assertEquals(100, runner.rounders(99));
        assertEquals(2000, runner.rounders(1445));
    }

}