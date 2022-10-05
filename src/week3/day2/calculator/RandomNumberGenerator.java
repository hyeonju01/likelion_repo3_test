package week3.day2.calculator;

public class RandomNumberGenerator implements NumberGenerator
{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * 10);
    }
}
