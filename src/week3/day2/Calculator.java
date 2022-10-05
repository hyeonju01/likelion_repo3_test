package week3.day2;

import com.sun.security.jgss.GSSUtil;

public class Calculator {
    int a;
    int b;

    Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public void plus(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }

    public void minus(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a - b);
    }

    public void multiple(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(a * b);
    }

    public void divide(int a, int b){
        this.a = a;
        this.b = b;
        double result = (double)a/b;
        if (b==0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println(result);
    }
}
