package day11.io.rw;

import day11.io.Path;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(Path.ROOT_PATH + "/메롱.txt"))) {

            String readString = br.readLine();
            System.out.println(readString);

            String[] split = readString.split(",");
            System.out.println(Arrays.toString(split));

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
