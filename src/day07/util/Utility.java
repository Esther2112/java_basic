package day07.util;

import java.util.Scanner;

public class Utility {
    private static Scanner sc = new Scanner(System.in);
    private Utility(){}
    public static void makeLine(){
        System.out.println("=============================");
    }

    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
}
