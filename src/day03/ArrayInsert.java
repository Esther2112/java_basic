package day03;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        //20이랑 30사이에 넣고싶음(2번 인덱스에 꽂아야함)
        int newData = 25;
        int targetIndex = 2;

        System.out.println("변경전 배열 : " + Arrays.toString(arr));
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        for(int i = temp.length - 1; i > targetIndex; i--){
            temp[i] = temp[i - 1];
        }
        temp[targetIndex] = newData;

        arr = temp;
        temp = null;

        System.out.println("변경후 배열 : " + Arrays.toString(arr));
    }
}
