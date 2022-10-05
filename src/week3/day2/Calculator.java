package week3.day2;

import com.sun.security.jgss.GSSUtil;

public class Calculator {
    private int a;
    private int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple(){
        System.out.println(a * b);
    }

    public void divide(){
        if (b==0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println((double)a/b);
    }
}
