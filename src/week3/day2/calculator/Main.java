package week3.day2.calculator;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator randomnumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomnumberGenerator.generate(10);
        System.out.println("randomNumber는 " + randomNumber);

        SpecificNumberGenerator specificNumberGenerator = new SpecificNumberGenerator();
        int randomNumber2 = specificNumberGenerator.generate(10);
        System.out.println("specificNumber는: " + randomNumber2);

        Calculator calculator = new Calculator(randomnumberGenerator);
        calculator.plus();

        Calculator calculator2 = new Calculator(specificNumberGenerator);
        calculator2.plus();

    }

}
