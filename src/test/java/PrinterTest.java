import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){printer = new Printer(50, 18);}

    @Test
    public void hasSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void willPrintIfEnoughSheets(){
        printer.print(4, 2);
        assertEquals(42, printer.getSheets());
    }

    @Test
    public void willNotPrintWithoutSheets(){
        Printer emptyPrinter = new Printer(16, 12);
        emptyPrinter.print(9, 2);
        assertEquals(16, emptyPrinter.getSheets());
    }

    @Test
    public void reducesTonerOnPrint(){
        printer.print(2, 4);
        assertEquals(10, printer.getToner());
    }

    @Test
    public void willNotPrintWithoutToner(){
        Printer lowTonerPrinter = new Printer(30, 6);
        lowTonerPrinter.print(10, 2);
        assertEquals(30, lowTonerPrinter.getSheets());
        assertEquals(6, lowTonerPrinter.getToner());
    }
}
