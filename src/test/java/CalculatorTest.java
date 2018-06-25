import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd1And2() {
        assertEquals(3, Calculator.add(1,2));
    }

    @Test
    public void canSubtract4and2() {
        assertEquals(2, Calculator.subtract(4,2));
    }

    @Test
    public void canMultiply3and7() {
        assertEquals(21, Calculator.multiply(3,7));
    }



}
