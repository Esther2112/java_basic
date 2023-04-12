package day13;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        // stream의 filter
        //필터 조건에 맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요

        List<Dish> filteredList = menuList.stream()
                .filter(dish ->dish.isVegeterian())
                .collect(toList());

        System.out.println("========= 채식주의자를 위한 메뉴 =========");
        for (Dish dish : filteredList) {
            System.out.println(dish.getName());
        }

    }
}
