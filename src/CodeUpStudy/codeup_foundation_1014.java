package CodeUpStudy;
//1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)

import java.util.Scanner;

public class codeup_foundation_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstChar, SecondChar;
        firstChar = sc.next().charAt(0);
        SecondChar = sc.next().charAt(0);
        System.out.println(firstChar +""+ SecondChar);

    }
}
