package day11.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputExample {

    public static void main(String[] args) {
        String path = "C:\\java_basic\\src\\day01\\Scope.java";

        try (InputStream fis = new FileInputStream(path);) {
            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); //write : 아스키를 문자로 출력
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일 읽어오기에 실패하였습니다");
        } catch (IOException e) {
            System.out.println("파일 읽어오기에 실패하였습니다");
        }


    }
}
