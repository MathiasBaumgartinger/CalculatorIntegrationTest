import calc.Calculator;
import calc.CalculatorFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalcTest {
    private Calculator calc;

    @BeforeEach
    public void setup () {
        CalculatorFactoryImpl factory = new CalculatorFactoryImpl();
        calc = factory.createInstance(true);
    }

    @Test
    public void testSum() {
        assertEquals(3, calc.sum(2, 1));
    }

    @Test
    public void throwsIllegal() {
        assertThrows(IllegalArgumentException.class, () -> calc.sum(1, 2, 3));
    }
}
