package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.ChessKnight;

import static org.junit.Assert.*;

public class ChessKnightTest {
    @Test
    public void chessKnight() throws Exception {
        ChessKnight runner = new ChessKnight();
        assertEquals(6, runner.chessKnight("c2"));
    }

    @Test
    public void convert() throws Exception {
    }

    @Test
    public void check() throws Exception {
    }

}