package week3.day3;
//알파벳 하나씩 출력하는 서비스

public class AlphabetCnt {

    static boolean isAlphabet(char c){
        if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
            return false;
        }return true;
    }


    public static void main(String[] args) {
        String str = "so what";
        for (int i =0; i < str.length(); i++) {
            System.out.println(i+"번째 알파벳은 "+ str.charAt(i) + "입니다.");
            if (isAlphabet(str.charAt(i))){
                System.out.println(str.charAt(i)+"은 알파벳입니다.");
            }else{
                System.out.println(str.charAt(i)+"은 알파벳이 아닙니다.");
            };
            System.out.println("---");
        }
    }
}