package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        //배열 객체 생성 (동종모음구조)
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        System.out.print("arr = " + arr);


        //foreach문
        System.out.println("=======================");

//        for (int x : arr) {
//            System.out.print(x + " ");
//
//        }

        //배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));

    }
}
