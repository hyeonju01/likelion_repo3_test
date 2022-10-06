package week3.day2.calculator2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new BypassNumberGenerator());
//        Calculator bypassNumberGenerator = new BypassNumberGenerator();
        calculator.plus(10);
//        bypassNumberGenerator.create(20);
//        bypassNumberGenerator.create(20, 30);
    }
}