package week3.day3;
import java.io.*;

public class FileListPrint {

    public static void main(String[] args) {

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

}
