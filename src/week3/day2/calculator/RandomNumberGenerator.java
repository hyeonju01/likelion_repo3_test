package week3.day2.calculator;

// 인터페이스 NumberGenerator를 상속하는 RandomNumberGenerator
public class RandomNumberGenerator implements NumberGenerator
{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
