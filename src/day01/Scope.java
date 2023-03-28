package day01;

public class Scope {


    public static void main(String[] args) {

        int userNumber = 1010;

        //자바는 블록단위 스코프를 가짐
        int n1 = 10;
        int n2 = 20;

        if (true) {
            int n3 = n1 + n2;
            System.out.println(n3);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }//end main

}
