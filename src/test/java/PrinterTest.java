import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 1000);
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

    @Test
    public void canRefillBy20Sheets() {
        printer.refillSheets(20);
        assertEquals(120, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void usesTonerForPrinting3Pages4CopiesHasEnoughSheets() {
        printer.photocopy(3,4);
        assertEquals(988, printer.getToner());
    }

    @Test
    public void cantPrintNotEnoughToner() {
        printer.refillSheets(20000);
        printer.photocopy(200,20);
        assertEquals(1000, printer.getToner());
    }
}
