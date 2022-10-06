package week3.day3;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

public class RndAlphaWithoutDuplicatred {
    public static void main(String[] args) {

        RndAlphaGenerator rndAlphaGenerator = new RndAlphaGenerator();
        HashSet<Character> rndAlpha = new HashSet<>();

        for(int i = 0; i < 200; i++){
            char a = rndAlphaGenerator.generate();
            rndAlpha.add(a);
        }

        System.out.println(rndAlpha);
    }
}
