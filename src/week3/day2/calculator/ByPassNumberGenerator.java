package week3.day2.calculator;

public class ByPassNumberGenerator implements NumberGenerator{
    //정수 num을 그대로 반환하는 클래스

    @Override
    public int generate(int num) {
        return num;
    }
}
