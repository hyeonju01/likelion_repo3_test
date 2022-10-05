package CodeUpStudy;
//1018 : [기초-입출력] 시간 입력받아 그대로 출력하기(설명)

import java.util.Scanner;

public class codeup_foundation_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(":");
        System.out.printf("%s:%s", time[0], time[1]);
    }
}
