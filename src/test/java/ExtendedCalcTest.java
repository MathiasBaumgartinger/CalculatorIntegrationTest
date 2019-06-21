import calc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExtendedCalcTest {

    private Calculator calc;

    @BeforeEach
    public void setup () {
        CalculatorFactoryImpl factory = new CalculatorFactoryImpl();
        calc = factory.createInstance(false);
    }

    @Test
    public void testSum() {
        assertEquals(3, calc.sum(2, 1));
    }

    @Test
    public void testSum2() {
        assertEquals(6, calc.sum(3, 2, 1));
    }
}
