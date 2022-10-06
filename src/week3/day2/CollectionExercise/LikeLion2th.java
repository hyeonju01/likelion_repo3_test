package week3.day2.CollectionExercise;
import java.util.ArrayList;
import java.util.List;

// 15:00 List 실습
public class LikeLion2th {
    private List<String> students = new ArrayList<>(); //studen's'로 선언

    //(실습) 멋사자 2기 학생의 이름이 들어있는 List를 리턴하는 method
    public LikeLion2th() {
        Names names = new Names();
        this.students.add("강동연"); //add?
        this.students.add("강수빈"); //add?
    }

    public List<String> getStudentList() {
        return new ArrayList<>();
    }

}
