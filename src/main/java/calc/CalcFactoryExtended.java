package calc;

public class CalcFactoryExtended implements ICalcFactory {
    public ICalculator create() {
        return new ExtendedCalc();
    }
}
