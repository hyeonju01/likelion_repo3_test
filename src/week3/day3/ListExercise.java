package week3.day3;

import java.util.ArrayList;
import java.util.List;


public class ListExercise {

    private List<String> students;

    public ListExercise() {
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
