package week3.day1;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        System.out.print("금액을 넣으세요: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int temp = 0;

        int cnt_50000 = money / 50000;
        temp = money % 50000;
        System.out.print("50000원권 몫: " + cnt_50000 + "개 ");
        System.out.println("50000원권 나머지: " + temp + "개");

        int cnt_10000 = temp / 10000;
        temp = temp % 10000;
        System.out.print("10000원권 몫: " + cnt_10000 + "개 ");
        System.out.println("10000원권 나머지: " + temp + "개");

        int cnt_5000 = temp / 5000;
        temp = temp % 5000;
        System.out.print("5000원권 몫: " + cnt_5000 + "개 ");
        System.out.println("5000원권 나머지: " + temp + "개");

        int cnt_1000 = temp / 1000;
        temp = temp % 1000;
        System.out.print("1000원권 몫: " + cnt_1000 + "개 ");
        System.out.println("1000원권 나머지: " + temp + "개");

        int cnt_500 = temp / 500;
        temp = temp % 500;
        System.out.print("500원권 몫: " + cnt_500 + "개 ");
        System.out.println("500원 나머지: " + temp + "개");

        int cnt_100 = temp / 100;
        temp = temp % 100;
        System.out.print("100원권 몫: " + cnt_100 + "개 ");
        System.out.println("100원권 나머지: " + temp + "개");

        int cnt_50 = temp / 50;
        temp = temp % 50;
        System.out.print("50원권 몫: " + cnt_50 + "개 ");
        System.out.println("50원권 나머지: " + temp + "개");

        int cnt_10 = temp / 10;
        temp= temp % 10;
        System.out.print("10원권 몫: " + cnt_10 + "개 ");
        System.out.println("10원권 나머지: " + temp + "개");
    }
}