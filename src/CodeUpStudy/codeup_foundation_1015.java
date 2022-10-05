package CodeUpStudy;
//1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)

import java.util.Scanner;

public class codeup_foundation_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        String result = String.format("%.3f", num);
        System.out.println(result);
    }
}
