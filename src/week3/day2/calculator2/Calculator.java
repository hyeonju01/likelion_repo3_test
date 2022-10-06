package week3.day2.calculator2;

public class Calculator implements NumberCreator{

    NumberCreator numberCreator;

    public Calculator(NumberCreator numberCreator){
        this.numberCreator = numberCreator;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.create(num));
    }

    @Override
    public int create(int num) {
        return 0;
    }
}