package day11.io.objstream;

import day11.io.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadSnack {

    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        snackList = loadFile();

        for (Snack snack : snackList) {
            System.out.println(snack);
        }
    }

    private static List<Snack> loadFile() {
        try (FileInputStream fis = new FileInputStream(Path.ROOT_PATH + "/snack.sav")){
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> object = (List<Snack>) ois.readObject();
            snackList = object;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return snackList;
    }
}
