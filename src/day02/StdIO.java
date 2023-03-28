package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {
        String dog = "멍멍이", cat = "야옹이";
        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";
        System.out.printf("%d월 %d일은 %s입니다\n", month, day, anni);

        double rate = 25.4567;
        System.out.printf("오늘의 할인율은 %.2f입니다\n", rate);
        System.out.printf("오늘의 할인율은 %.2f%%입니다\n", rate);

        //표준입력
//        int result = System.in.read();
        //read()는 입력된 값을 아스키코드로 처리하기 때문에 문자열로 받기 위해서는 변환해야함
        //이를 보관한 것이 Scanner임

        Scanner sc = new Scanner(System.in);
//        int result = sc.nextInt();
        String str = sc.nextLine();
            int result = 0;
        try {
            //str을 정수변환
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수를 입력하거라");
        }

            System.out.println("result = " + result);

    }
}
