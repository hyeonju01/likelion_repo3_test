package week3.day3;
import java.io.*;
//2글자 읽기
public class FileListPrint {

    public void printFiles() {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar() throws IOException {
        FileReader fileReader = new FileReader("파일네임");
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str = str + (char) fileReader.read();
        str = str + (char) fileReader.read();
        return str;
    }
    public static void main(String[] args) throws IOException{
        FileListPrint filelistprint = new FileListPrint();
        String str = filelistprint.read2Chars("./a_file.txt");
//        System.out.println(fileReader.read()); //ascii코드 반환
//        System.out.println((char)fileReader.read()); //문자 반환
        System.out.println(str);

    }

}

/*
*
* ./.DS_Store
./out
./likeLion.iml
./.git
./a_file.txt
./.idea
./src
*
* */