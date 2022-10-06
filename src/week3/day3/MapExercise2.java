package week3.day3;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/sandee-han/java-project-push-exercise"; //git 주소

        //알파벳 제거
        String match = "[^a-zA-Z]";
        String AlphabetRepoAddress = repoAddr.replaceAll(match, "");

        //알파벳



        HashMap<String, Integer> alphabetCnt = new HashMap<>();
        alphabetCnt.put("a", 2);

        // 전체 해쉬맵 순환하며 알파벳 별 개수 출력하기


    }
}
