package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.KnapsackLight;

import static org.junit.Assert.*;

public class KnapsackLightTest {
    @Test
    public void knapsackLight() throws Exception {
        KnapsackLight runner = new KnapsackLight();
        assertEquals(10, runner.knapsackLight(10, 5, 6, 4, 8));
        assertEquals(16, runner.knapsackLight(10, 5, 6, 4, 9));
    }

}