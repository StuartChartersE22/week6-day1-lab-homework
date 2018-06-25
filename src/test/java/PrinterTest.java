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
    public void canMakeCopiesFor3Pages4Copies() {
        printer.photocopy(3,4);
        assertEquals(88, printer.getSheets());
    }
}
