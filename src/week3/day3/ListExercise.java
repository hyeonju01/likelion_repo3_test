package week3.day3;

import java.util.ArrayList;
import java.util.List;


public class ListExercise {

    // 외부 접근을 막기 위해 private으로 선언
    private List<String> students;
    // 초기화 방법 1
    // private List<String> students = new ArrayList<>();

    public ListExercise() {
        // 초기화 방법 2
        this.students = new ArrayList<>();
        this.students.add("강미미");
        this.students.add("나미미");
        this.students.add("도미미");
        this.students.add("라미미");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
