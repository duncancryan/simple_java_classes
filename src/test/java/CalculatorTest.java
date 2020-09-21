import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(3, 7));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(7, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(18, calculator.multiply(6, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(5.00, 2.00), 0.01);
    }
}
