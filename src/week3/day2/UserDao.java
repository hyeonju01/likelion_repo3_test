package week3.day2;

public class UserDao {
    //DAO: Data Access Object
    public void plus (int first, int second) {
        System.out.println(first + second);
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();// 코드 초반에 실행한다.
        userDao.plus(10, 20);
        // 안되는 이유는?

        /* 자바는 보통 클래스를 생성, psvm문에서 코드가 실행된다.
        * 뒤에 스프링을 할 때 클래스를 이해할 수 있을 것이다. 지금은 이해하기 쉽지는 않다.
        * 실망하지 않아도 된다!
        * 보통 psvm문에서 코드가 실행되거나 다른 클래스를 불러다가 쓴다.
        * 실무에서 클래스 안에 메인을 많이 넣지는 않는다. 실행 시 편의상 넣어둔 기능이다.
        * 파이썬, node.js등 다른 언어들은 이런 기능이 없다. */

    }
}
