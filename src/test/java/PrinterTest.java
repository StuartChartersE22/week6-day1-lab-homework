import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test
    public void hasSheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canMakeCopiesFor3Pages4CopiesHasEnoughSheets() {
        printer.photocopy(3,4);
        assertEquals(88, printer.getSheets());
    }

    @Test
    public void cantMakeCopiesFor10pages20copiesNotEnoughSheets() {
        printer.photocopy(10, 20);
        assertEquals(100, printer.getSheets());
    }
}
