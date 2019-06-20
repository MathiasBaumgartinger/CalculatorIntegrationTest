package calc;

public class ExtendedCalc implements ICalculator {

    private Mockit toBeMocked;

    ExtendedCalc() {}

    public int sum(int a, int b) {
        return a + b;
    }
}
