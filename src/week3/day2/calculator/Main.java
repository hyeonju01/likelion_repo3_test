package week3.day2.calculator;

import week3.day2.calculator2.NumberCreator;

public class Main {
    public static void main(String[] args) {
        // NumberGenerator 인터페이스에 RandomNumberGenerator 클래스 객체 생성
        NumberGenerator numberGenerator = new RandomNumberGenerator();

        // Calculator 클래스 변수명에 위에서 생성한 numberGenerator(사실은 랜덤 넘버 제너레이터)를 인자로 전달
        Calculator randomCalculator = new Calculator(numberGenerator);
        randomCalculator.plus(10); //결과:(int)(Math.random() * 10);

        Calculator specificCalculator = new Calculator(new SpecificNumberGenerator());
        specificCalculator.plus(30); // 20030

        Calculator byPassNumberGenerator = new Calculator(new ByPassNumberGenerator());
        byPassNumberGenerator.plus(50); //결과: 60

        //생성자 오버로딩
        Calculator byPassNumberGenerator2 = new Calculator(new ByPassNumberGenerator(), 100);
        byPassNumberGenerator2.plus(50); //결과: 150
    }
}