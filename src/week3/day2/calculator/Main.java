package week3.day2.calculator;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator randomnumberGenerator = new RandomNumberGenerator();

        SpecificNumberGenerator specificNumberGenerator = new SpecificNumberGenerator();

        Calculator calculator = new Calculator(randomnumberGenerator);
        calculator.plus(10);

        Calculator calculator2 = new Calculator(specificNumberGenerator);
        calculator2.plus(10);
    }

}
