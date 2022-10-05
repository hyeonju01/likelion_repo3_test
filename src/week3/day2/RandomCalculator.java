package week3.day2;

public class RandomCalculator {

    int RandomNumber = (int)(Math.random() * 10) + 0;

    public void getRandomNumber(){
        System.out.println("랜덤 넘버는 " + RandomNumber + " 입니다.");
    }
    public void plus(int a){
        System.out.println(RandomNumber);
        System.out.println(a + RandomNumber);
    }

    public void minus(int a){
        System.out.println(a - RandomNumber);
    }

    public void multiple(int a){
        System.out.println(a * RandomNumber);

    }

    public void divide(int a){
        if (RandomNumber == 0){
            System.out.println("랜덤 넘버가 0입니다.");
        }else {
            System.out.println(a / RandomNumber);
        }
    }
}