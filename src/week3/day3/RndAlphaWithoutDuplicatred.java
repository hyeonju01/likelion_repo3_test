package week3.day3;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;

public class RndAlphaWithoutDuplicatred {
    public static void main(String[] args) {
        //알파벳 생성기 클래스 객체 생성
        RndAlphaGenerator rndAlphaGenerator = new RndAlphaGenerator();

        HashSet<Character> rndAlpha = new HashSet<>();

        for (int i = 0; i < 200; i++) {
            char a = rndAlphaGenerator.generate();
            rndAlpha.add(a);
        }

        //while문으로도 작성해볼 수 있다.
        //while ( cnt<100) {
        //rndAlpha.add(rndAlphaGenerator.generate());
        //cnt ++;
        //}

        System.out.println(rndAlpha);
    }
}