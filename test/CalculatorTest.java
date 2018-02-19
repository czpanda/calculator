import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testSolutionExists() {
        assertTrue(Calculator.solutionExists(5, 25, 4));
    }
}
