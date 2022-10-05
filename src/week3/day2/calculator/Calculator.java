package week3.day2.calculator;

public class Calculator {
    NumberGenerator numberGenerator;

    Calculator(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
    }

    public void plus() {
        //numGenerator가 생성해준 수에 10을 더하는 메소드
        System.out.println(10 + numberGenerator.generate(10));
    }
}
