package week3.day3;
//알파벳 하나씩 출력하는 서비스

public class AlphabetCnt {
    public static void main(String[] args) {
        String str = "so what";
        for (int i =0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
