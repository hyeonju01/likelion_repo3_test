import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        String num1Return, num2Return, SumReturn;

        if (!(num1%2==0)){
            num1Return = "홀수";
        }else {
            num1Return = "짝수";
        }

        if (!(num2%2==0)){
            num2Return = "홀수";
        }else {
            num2Return = "짝수";
        }

        if (!((num1 + num2)%2 ==0)){
            SumReturn = "홀수";
        }else {
            SumReturn = "짝수";
        }

        System.out.println(num1Return + "+" + num2Return + "=" + SumReturn );
    }
}
