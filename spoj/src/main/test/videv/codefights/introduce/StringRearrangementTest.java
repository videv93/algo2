package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.StringRearrangement;

import static org.junit.Assert.*;

public class StringRearrangementTest {
    @Test
    public void testPermutate() {
        StringRearrangement stringRearrangement = new StringRearrangement();
        String[] b = new String[] {"abc", "abx", "axx", "abc"};
        String[] c = new String[] {"q", "q"};
        assertEquals(false, stringRearrangement.stringsRearrangement(b));
        assertEquals(false, stringRearrangement.stringsRearrangement(c));
    }

    @Test
    public void testCheckDiff() {
        StringRearrangement stringRearrangement = new StringRearrangement();
        String[] inputArray1 =  new String[] {"aba", "bbb", "bab"};
        String[] inputArray2 =  new String[] {"bb", "ab", "aa"};
        String[] inputArray3 =  new String[] {"abc", "abc", "axx", "abx"};
        assertEquals(false, stringRearrangement.check(inputArray1, inputArray1.length));
        assertEquals(true, stringRearrangement.check(inputArray2, inputArray2.length));
        assertEquals(false, stringRearrangement.check(inputArray3, inputArray3.length));
    }
}