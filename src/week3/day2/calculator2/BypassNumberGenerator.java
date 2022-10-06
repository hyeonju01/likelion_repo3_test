package week3.day2.calculator2;

public class BypassNumberGenerator implements NumberCreator{

    @Override
    public int create(int num) {
        return num;
    }


    public int create(int num, int num2){
        return num + num2;
    }



}