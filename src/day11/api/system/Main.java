package day11.api.system;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //운영체제의 현재시간 읽기
        long time = System.currentTimeMillis();
        System.out.println("time = " + time);
        
        //코드
        long time2 = System.currentTimeMillis();
        //time2 - time1 = 코드 실행시간
        
        //배열카피
        int[] arr = {10, 20, 30};
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        System.out.println(Arrays.toString(copyArr));
        
    }
}
