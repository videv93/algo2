package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.LineEncoding;

import static org.junit.Assert.*;

public class LineEncodingTest {
    @Test
    public void lineEncoding() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertEquals("2a3bc", runner.lineEncoding("aabbbc"));
        assertEquals("abcd", runner.lineEncoding("abcd"));
        assertEquals("a2bca2b", runner.lineEncoding("abbcabb"));
    }

    @Test
    public void phase1() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertArrayEquals(new String[] {"aa", "bbb", "c"}, runner.phase1("aabbbc"));
    }

    @Test
    public void phase1Update() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertArrayEquals(new String[] {"aa", "bbb", "c"}, runner.phase1Update("aabbbc"));
    }

    @Test
    public void phase2() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertEquals("b", runner.phase2("b"));
        assertEquals("2b", runner.phase2("bb"));
    }

    @Test
    public void repeat() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertEquals("aa", runner.repeat("a", 2));
    }

    @Test
    public void repeatChar() throws Exception {
        LineEncoding runner = new LineEncoding();
        assertEquals("aa", runner.repeat('a', 2));
    }
}