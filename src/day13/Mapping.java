package day13;


import java.util.List;
import java.util.OptionalDouble;

import static day07.util.Utility.*;
import static day13.Dish.Type.*;
import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Mapping {

    public static void main(String[] args) {

        //stream의 map : 리스트에서 원하는 정보만 추출

        //메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream()
                .map(d -> d.getName())
                .collect(toList());
        System.out.println("dishNames = " + dishNames);

        makeLine();

        List<String> words = List.of("safari", "chrome", "opera", "ms edge", "firefox");

        List<Integer> lengths = words.stream()
                .map(w -> w.length())
                .collect(toList());
        System.out.println("lengths = " + lengths);

        makeLine();

        //메뉴목록에서 메뉴이름과 칼로리를 추출하는데
        // 칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후
        // 메뉴이름: xxxkcal로 반복출력하고 싶다
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(SimpleDish::new)
                .collect(toList());

        simpleDishes.forEach(s -> System.out.println(s));

        makeLine();
        /*
            메뉴 목록에서 칼로리가 500보다 큰 음식을 필터링 해서
            음식의 이름과 타입만 추출해서 출력해주세요
         */
        menuList.stream()
                .filter(d -> d.getCalories() > 500)
//                .limit(3)
                .map(DishNamenType::new)
                .forEach(d -> System.out.println(d));

        makeLine();

        //메뉴목록에 있는 요리들의 총칼로리수 구하기
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sumCal = " + totalCal);

        //육류메뉴의 평균 칼로리
        double avgCal = menuList.stream()
                .filter(d -> d.getType() == MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.println("avgCal = " + avgCal);



    }

}
