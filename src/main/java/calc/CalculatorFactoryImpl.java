package calc;

public class CalculatorFactoryImpl implements CalculatorFactory {

    public Calculator createInstance (boolean simple) {
        if (simple == true) {
            return new CalculatorSimpleImpl();
        }
        return new CalculatorExtendedImpl();
    }
}
