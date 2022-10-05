package CodeUpStudy;
//1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class codeup_foundation_1019 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String dayInput = sc.next();
            SimpleDateFormat today1 = new SimpleDateFormat("yyyy.mm.dd");
            SimpleDateFormat today2 = new SimpleDateFormat("yyyy.mm.dd");
            Date formattedDate = today1.parse(dayInput);
            String strNewFormattedDate = today2.format(formattedDate);
            System.out.println(strNewFormattedDate);
        }catch  (ParseException e) {
            e.printStackTrace();
        }
    }
}
