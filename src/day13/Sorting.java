package day13;

import day07.util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        //stream의 정렬 sorted

        //메뉴 목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(d -> d.getCalories()))
                .collect(toList())
                .forEach(s -> System.out.println(s));

        makeLine();
        //메뉴 목록 중 이름으로 내림차 정렬(zyx순)
        menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .forEach(s -> System.out.println(s));

        makeLine();
        //원하는 개수만 필터링하기
        //칼로리가 300보다 큰 요리중 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .forEach(s -> System.out.println(s));


    }
}
