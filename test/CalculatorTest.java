import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSubtract() {
        Calculator c =  new Calculator(100);

        c.subtract(10);
        assertEquals(90, c.getValue());

        c.subtract(42);
        assertEquals(48, c.getValue());

        c.subtract(18);
        assertEquals(30, c.getValue());
    }

    @Test
    public void testMultiple() {
        Calculator c = new Calculator(20);

        c.mulitple(5);
        assertEquals(100, c.getValue());

        c.mulitple(-1);
        assertEquals(-100, c.getValue());

        c.mulitple(-2);
        assertEquals(200, c.getValue());

        c.mulitple(3);
        assertEquals(600, c.getValue());
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator(1000);

        c.divide(2);
        assertEquals(500, c.getValue());

        c.divide(5);
        assertEquals(100, c.getValue());

        c.divide(4);
        assertEquals(25, c.getValue());

        c.divide(25);
        assertEquals(1, c.getValue());
    }
}
