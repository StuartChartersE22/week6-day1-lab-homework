import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle(100);
    }


    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

}
