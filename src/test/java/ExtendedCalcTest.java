import calc.CalcFactoryExtended;
import calc.ExtendedCalc;
import calc.ICalculator;
import calc.Mockit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Tag("Extended")
@ExtendWith(MockitoExtension.class)
public class ExtendedCalcTest {

    @Mock
    private Mockit toBeMocked;

    @InjectMocks
    private ExtendedCalc calc;

    @BeforeEach
    public void setup () {
        CalcFactoryExtended factory = new CalcFactoryExtended();
        calc = (ExtendedCalc) factory.create();
    }

    @Test
    public void testSum() {
        assertEquals(3, calc.sum(2, 1));
    }

    @Test
    public void testMocks() {
        assertNotNull(toBeMocked);
        assertNotNull(calc);
    }
}
