package videv.codefights.introduce;

import org.junit.Test;
import videv.codefights.introduce.GrowingPlant;

import static org.junit.Assert.*;

public class GrowingPlantTest {
    @Test
    public void growingPlant() throws Exception {
        GrowingPlant runner = new GrowingPlant();
        assertEquals(-1, runner.growingPlant(100, 10, 910));
    }

}