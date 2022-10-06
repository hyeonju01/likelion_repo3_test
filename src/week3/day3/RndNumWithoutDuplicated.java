package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RndNumWithoutDuplicated {
    public static void main(String[] args) {
        RndNumGenerator rndNumGenerator = new RndNumGenerator();
        //HashSet 생성
        Set<Integer> rndNum = new HashSet<>();
        for (int i = 0; i < 50; i++){
            int r = rndNumGenerator.generate(10);
            rndNum.add(r);
            //생성된 난수 모두 출력
            System.out.println(r);
        }

        //HashSet 출력 (랜덤 제거)
        System.out.println(rndNum);
    }
}
