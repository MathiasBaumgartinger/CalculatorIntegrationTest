import calc.CalcFactorySimple;
import calc.ICalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalcTest {
    private ICalculator calc;

    @BeforeEach
    public void setup () {
        CalcFactorySimple factory = new CalcFactorySimple();
        calc = (factory.create());
    }

    @Test
    public void testSum() {
        assertEquals(3, calc.sum(2, 1));
    }
}
