package week3.day1;

import java.util.Scanner;

public class oddEvenSum {

    //리팩토링: 메소드 추상화, 스프링을 공부하기 위해 필요하다.
    //중복되는 기능은 하나의 method로 정리해야 한다.
    public static String getEvenOdd(int num) {
        //숫자를 받아서 짝수면 '짝수', 홀수면 '홀수' 리턴
        if (num % 2 == 0) {
            return "짝수";
        }else {
            return "홀수";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resNum = num1 + num2;

        String sNum1 = getEvenOdd(num1);
        String sNum2 = getEvenOdd(num2);
        String sResNum = getEvenOdd(resNum);

        System.out.println( sNum1 + "+" + sNum2 + "=" + sResNum );
    }
}
