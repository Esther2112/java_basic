package day11.io.stream;

import day09.abs.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {


    //데이터를 외부로 내보낼때 출력스트림
    public static void main(String[] args) {

        String msg = "멍멍이는 왈왕멍멍\n하하호호";

        //try 소괄호 안에서 객체생성을 하면 try-catch 문을 벗어날때 알아서 객체를 닫아준다
        try (OutputStream fos = new FileOutputStream("C:/exercise/dog.txt")) {
            fos.write(msg.getBytes());
            System.out.println("파일 저장에 성공!");
        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다");
        } catch (IOException e) {
            System.out.println("출력시스템에 문제가 생겼습니다");
        }

        /*finally {
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
