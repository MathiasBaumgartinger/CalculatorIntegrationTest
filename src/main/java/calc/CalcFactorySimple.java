package calc;

public class CalcFactorySimple implements ICalcFactory {
    public ICalculator create() {
        return new SimpleCalc();
    }
}
