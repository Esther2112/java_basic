package day07.lotto;

import java.util.Arrays;

public class Lotto {


    public static void information() {
        int[] lottoArr = new int[6];
        for (int i = 0; i < lottoArr.length; i++) {
            lottoArr[i] = (int)(Math.random()*45) + 1;
            for (int j = 0; j < i; j++) {
                if(lottoArr[j] == lottoArr[i]){
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(lottoArr));
    }
}
