package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.LineUp;

import static org.junit.Assert.*;

public class LineUpTest {
    @Test
    public void lineUp() throws Exception {
        LineUp runner = new LineUp();
        assertEquals(3, runner.lineUp("LLARL"));
        assertEquals(1, runner.lineUp("RLR"));
        assertEquals(0, runner.lineUp(""));
        assertEquals(5, runner.lineUp("AALAAALARAR"));
    }

}