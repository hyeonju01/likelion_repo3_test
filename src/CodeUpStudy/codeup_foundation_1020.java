package CodeUpStudy;

import java.util.Scanner;

//1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
public class codeup_foundation_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rawNum = sc.next();
        String[] noDashNum = rawNum.split("-");
        System.out.printf("%s%s", noDashNum[0], noDashNum[1]);
    }
}
