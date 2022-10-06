package week3.day3;

//파일 입출력 실습: 1byte씩 읽기

import java.io.BufferedReader;
패import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {



    public void printDirFiles(String filepath){

    }

    public void bufferedReader(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename), 16 * 1024);
        //버퍼 사이즈 : 16킬로바이트
        System.out.println((br.read()));
    }

    public static void main(String[] args) throws FileNotFoundException {
        //FileNotFoundException 발생 가능하므로 throws 해준다.
        ReadFile readFile = new ReadFile();
        try{
            readFile.bufferedReader("./a_file.txt");

        }catch(IOException e){
            e.printStackTrace();
        }

        readFile.printDirFiles("./");
    }
}
