package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("C:/exercise/메롱.txt")) {
            String s = "메롱메롱메로엠메메메롱롱\nㅋㅋㅋㅋㅋㅋㅋㅋ캬컄ㅋㅋㅋㅋ";
            fw.write(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
