package week3.day3;
import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        //해쉬셋, treeset도 있으며 해쉬셋을 많이 사용한다.
        //리스트보다는 셋을 많이 쓰는 것을 권장한다.
        //셋은 중복을 허용하지 않는 List.
        //셋에 든 값은 유일하다.
        set1.add("경록");
        set1.add("경록");
        set1.add("경록");
//        System.out.println(set1);

        //중복 검사할 때 셋에 넣으면 된다.

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);
        System.out.println(setInteger);


    }
}
