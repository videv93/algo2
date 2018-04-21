package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.BuildPalindrome;

import static org.junit.Assert.*;

public class BuildPalindromeTest {
    @Test
    public void buildPalindrome() throws Exception {
        BuildPalindrome runner = new BuildPalindrome();
        assertEquals("abcdcba", runner.buildPalindrome("abcdc"));
    }

    @Test
    public void isPalindrome() throws Exception {
        BuildPalindrome runner = new BuildPalindrome();
        assertTrue(runner.isPalindrome("a"));
        assertTrue(runner.isPalindrome("aa"));
        assertTrue(runner.isPalindrome("aba"));
        assertTrue(runner.isPalindrome("aaaa"));
        assertTrue(runner.isPalindrome("aaaaa"));
    }

}