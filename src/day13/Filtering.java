package day13;

import day07.util.Utility;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Dish.*;
import static day13.Dish.Type.*;
import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        // stream의 filter
        //필터 조건에 맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요

        List<Dish> filteredList = menuList.stream()
                .filter(dish ->dish.isVegetarian())
                .collect(toList());

        System.out.println("========= 채식주의자를 위한 메뉴 =========");
//        for (Dish dish : filteredList) {
//            System.out.println(dish.getName());
//        }
        filteredList.forEach(dish -> System.out.println(dish));

        makeLine();
        //메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링
        menuList.stream()
                .filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();
        //메뉴목록중에 요리의 이름이 4글자인 요리들만 필터링해서 출력
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();
        //원하는 개수만 필터링하기
        //칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) //앞에서부터 3개 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();
        //칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제끼고 출력
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) //앞에서부터 2개 스킵
                .limit(3)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        //메뉴 목록에서 처음 등장하는 2개의 고기요리를 필터링 후 리스트에 반환
        List<Dish> meatList = menuList.stream()
                .filter(d -> d.getType() == MEAT)
                .limit(2)
                .collect(toList());

        System.out.println(meatList.size());
        System.out.println(meatList);

        makeLine();
        menuList.stream()
                .filter(d -> d.getType() == MEAT)
                .limit(2)
                .collect(toList())
                .forEach(d-> System.out.println(d));

        makeLine();
        List<Integer> numbers = List.of(1, 2, 3, 4, 1, 3, 1, 5, 3);

        //리스트에서 중복 제거
        List<Integer> distinctList = numbers.stream()
                .distinct()
                .collect(toList());
        System.out.println(distinctList);


    }
}
