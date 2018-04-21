package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.MakeArrayConsecutive2;

import static org.junit.Assert.*;

public class MakeArrayConsecutive2Test {
    @Test
    public void makeArrayConsecutive2() throws Exception {
        MakeArrayConsecutive2 runner = new MakeArrayConsecutive2();
        assertEquals(3, runner.makeArrayConsecutive2(new int[] {6,2,3,8}));
    }

}