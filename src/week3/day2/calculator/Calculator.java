package week3.day2.calculator;

// NumberGenerator에서 만들어준 숫자를 가지고 사칙 연산한 결과를 출력한다.
public class Calculator {

    private NumberGenerator numberGenerator;
    private int baseNum = 10;

    // numberGenerator 인터페이스를 di로 받는 생성자
    public Calculator(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
    }

    // 생성자 오버로딩
    // Constructor Overloading
    public Calculator(NumberGenerator numberGenerator, int baseNum){
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }


    public void plus(int num) {
        //RandomNumberGenerator가 생성해준 수에 10을 더하는 메소드
        int result = num + this.numberGenerator.generate(this.baseNum);
        System.out.println(result);
    }
}
