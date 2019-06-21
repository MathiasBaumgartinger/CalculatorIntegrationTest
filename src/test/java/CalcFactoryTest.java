import calc.Calculator;
import calc.CalculatorExtendedImpl;
import calc.CalculatorFactoryImpl;
import calc.CalculatorSimpleImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("integration")
public class CalcFactoryTest {

    private CalculatorFactoryImpl factory;

    @BeforeEach
    public void setUp() {
        factory = new CalculatorFactoryImpl();
    }

    @Test
    public void integrationSimpleTest() {
        Calculator calc = factory.createInstance(true);
        assertSame(calc.getClass(), CalculatorSimpleImpl.class);
    }

    @Test
    public void integrationExtendedTest() {
        Calculator calc = factory.createInstance(false);
        assertSame(calc.getClass(), CalculatorExtendedImpl.class);
    }
}
