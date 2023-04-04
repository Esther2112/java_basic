package day07.static_;

import day07.util.Utility;

// static 필드와 메서드를 클래스이름 없이 참조 가능
import static day07.util.Utility.*;
public class Main {

    public static void main(String[] args) {
        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        c1.x = 10;
        c2.y = 20;
        c2.x++;
        c2.m2();

        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);

        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();


        cal1.color = "빨강";
        cal2.color = "초록";
        System.out.println("cal2.color = " + cal2.color);

        makeLine();
        makeLine();
        input("하하호호 : ");
    }
}
