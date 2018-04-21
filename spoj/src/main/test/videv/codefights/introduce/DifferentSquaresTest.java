package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.DifferentSquares;

import static org.junit.Assert.*;

public class DifferentSquaresTest {
    @Test
    public void differentSquares() throws Exception {
        DifferentSquares runner = new DifferentSquares();
        int[][] matrix = new int[][] {
                {1,2,1},
                {2,2,2},
                {2,2,2},
                {1,2,3},
                {2,2,1},
        };
        assertEquals(6, runner.differentSquares(matrix));
    }

    @Test
    public void check() throws Exception {
        DifferentSquares runner = new DifferentSquares();
        int[][] matrix = new int[][] {
                {1,2,1},
                {2,2,2},
                {2,2,2},
                {1,2,3},
                {2,2,1},
        };
        assertTrue(runner.check(matrix, 1,0, 1, 1));
    }

}