package CodeUpStudy;
//1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명)

import java.util.Scanner;

public class codeup_foundation_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charInput = sc.next().charAt(0);
        System.out.println(charInput);
    }
}
