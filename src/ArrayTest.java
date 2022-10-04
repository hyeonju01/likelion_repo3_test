public class ArrayTest {
    public static void main(String[] args) {

//        System.out.println("hello"); // option + control + R -> 실행 단축키

        //10칸의 int array를 만들고 1~10까지 채우고, 콘솔에 출ㄹ력
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i] = i+1;
        }

        for (int i=0; i<10; i++){
            System.out.println(arr[i]);
        }

    }
}
