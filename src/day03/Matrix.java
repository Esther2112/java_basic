package day03;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {10, 100, 35};

        //2차원 배열
        int[][] classScores = {kimScores, parkScores, hongScores};

//        System.out.println(classScores[0]);
//        System.out.println(kimScores[0]);

        //배열의 주소값을 보여줌
//        System.out.println(Arrays.toString(classScores));
//        System.out.println(classScores[1]);
//        System.out.println(parkScores);

        //Arrays.deepToString() : 2차원 배열의 내부 값들을 보여줌
//        System.out.println(Arrays.deepToString(classScores));

        //2차원 배열의 값 초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300}
        };
//        System.out.println("=============================");
//        System.out.println(arr2d[1][2]);

        int[] arr3 = arr2d[2];

        //2차원 배열의 순회
//        for(int i = 0; i < arr2d.length; i++){
//            for(int j = 0; j < arr2d[i].length; j++){
//                System.out.print(arr2d[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] arr : arr2d) {
            for (int n : arr) {
//                System.out.printf("%5d", n);
            }
//            System.out.println();
        }

//        System.out.println("==========================");

        //배열의 기본값
        //정수배열은 0이 기본값, 실수는 0.0이 기본값
        //논리는 거짓이 기본
        //char 배열은 기본값 공백
        //나머지는 전부 null이 기본
//        int[] numbers = new int[5];
//        System.out.println(Arrays.toString(numbers));

        //5행 4열의 2차원 배열을 생성만 하고 싶다.
        int[][] newArray = new int[5][4];


        //2차원 배열의 수정
        //newArray 배열 중 2행 4열의 값을 90으로 바꾸고 싶다
        newArray[1][3] = 90;
        //newArray 배열 중 3행 2열의 값을 90으로 바꾸고 싶다
        newArray[2][1] = 55;

        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }

        //배열 선언과 동시 초기화가 아니므로 new int[] 생략 불가
        arr2d[3] = new int[]{9, 8, 7, 6};

        //3차원 배열
        int[][][] arr3d = {
                {
                        {10, 20},
                        {30, 40}
                },
                {
                        {50, 60},
                        {70, 80}
                },
                {
                        {90, 100},
                        {200, 300}
                },
        };


    }

}
