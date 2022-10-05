package week3.day2;

public class RandomCalculator {

    int num;
    int RandomNumber = (int)(Math.random() * 10) + 0;

    RandomCalculator(int a){
        this.num = a;
    }
    public void getAllNumber(){
        System.out.println("입력된 수는 " + num + " 입니다.");
        System.out.println("랜덤 수는 " + RandomNumber + " 입니다.");
    }
    public void plus(){
        int result = num + RandomNumber;
        System.out.println("덧셈 결과는: " + result);
    }

    public void minus(){
        int result = num - RandomNumber;
        System.out.println("뺄셈 결과는: " + result);
    }

    public void multiple(){
        int result = num + RandomNumber;
        System.out.println("곱셈 결과는: " + result);
    }

    public void divide(){
        if (RandomNumber == 0){
            System.out.println("랜덤 넘버가 0입니다.");
        }else {
            int result = num / RandomNumber;
            System.out.println("나눗셈 결과는: " + result);
        }
    }
}