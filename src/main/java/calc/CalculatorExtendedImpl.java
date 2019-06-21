package calc;

public class CalculatorExtendedImpl implements Calculator {

    CalculatorExtendedImpl() {}

    public int sum(int... numbers) {
        int sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }
}
