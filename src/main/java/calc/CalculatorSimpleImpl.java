package calc;

public class CalculatorSimpleImpl implements Calculator {
    CalculatorSimpleImpl() {}

    public int sum(int... numbers) {
        if (numbers.length > 2) {
            throw new IllegalArgumentException();
        }
        return numbers[0] + numbers[1];
    }
}
