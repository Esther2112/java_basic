package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static String[] push(String[] arr, String newData) {
        //1. 원본 배열보다 1개 사이즈가 더 큰 새 배열 생성
        String[] temp = new String[arr.length + 1];

        //2. 원본 배열 데이터 새 배열로 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //3. 새로운 데이터를 새 배열의 끝인덱스에 추가
        temp[temp.length - 1] = newData;


        //4. 주소값 이전
        arr = temp;
        temp = null;

        System.out.println("먹고싶은 음식 : " + Arrays.toString(arr));
        return arr;
    }

    public static String pop(String[] arr) {
        if (arr.length > 0) {
            String delTarget = arr[arr.length - 1];

            //1. 원본 배열보다 1개 사이즈 작은 새 배열 생성
            String[] temp = new String[arr.length - 1];
            //2. 맨 마지막 데이터만 빼고 모두 복사
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i];
            }

            //3. 주소값 이전
            arr = temp;
            temp = null;

            System.out.println(delTarget + "을 삭제하였습니다");
            return ("먹고싶은 음식 : " + Arrays.toString(arr));
        }
        return "더이상 삭제할 데이터가 없습니다";
    }
//    static String[] arr = new String[]{};

    public static void main(String[] args) {
        String[] foodList = new String[0];
        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("# 먹고싶은 음식을 입력하세요\n");
            System.out.print("# 음식을 삭제하려면 <삭제>라고 입력하세요\n");
            System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");
            String answer = sc.nextLine();
            if (answer.equals("그만")) {
                break;
            } else if (answer.equals("삭제")) {
                System.out.println(pop(foodList));
            } else {
                foodList = push(foodList, answer);
            }
        }
        System.out.println("종료합니다");

    }
}
