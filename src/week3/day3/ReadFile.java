package week3.day3;

//파일 입출력 실습: 1byte씩 읽기

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void bufferedReader(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename), 16 * 1024);
        System.out.println((char)(br.read()));
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        try{
            readFile.bufferedReader("./a_file.txt");
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
