package week3.day3;
// 1. 복습, 유튜브 참고
import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        //listExercise.students.add("rlasksk"); // 컴파일 에러
        List<String> students = listExercise.getStudents();
        for (String student : students ) {
            System.out.println(student);
        }
        System.out.println("전체 학생은: " + students.size() + "명 입니다.");
    }
}
