package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day07.util.Utility;

import java.util.List;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.*;

public class Main {

    public static void main(String[] args) {

        //사과바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED),
                new Apple(97, Color.RED),
                new Apple(110, Color.YELLOW),
                new Apple(80, Color.YELLOW),
                new Apple(100, Color.GREEN),
                new Apple(88, Color.YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 =========");
        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========= 노랑 사과 필터링 =========");
        List<Apple> filteredApples = filterApplesByColor(appleBasket, Color.RED);
        for (Apple filteredApple : filteredApples) {
            System.out.println("filteredApple = " + filteredApple);
        }
        System.out.println("========= 원하는 사과 필터링 =========");
        List<Apple> filterApples = filterApples(appleBasket, new LightApplePredicate());

        System.out.println("========= 원하는 사과 필터링 =========");
        List<Apple> filteredList = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() <= 100;
            }
        });
        for (Apple apple : filteredList) {
            System.out.println(apple);
        }

        makeLine();
        //녹색이면서 100g보다 큰 사과들만 필터링
        List<Apple> filteredApplesList = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 100 && apple.getColor() == Color.GREEN;
            }
        });
        for (Apple apple : filteredApplesList) {
            System.out.println(apple);
        }

        //람다로 변환
        List<Apple> filteredApplesList1 = filterApples(appleBasket,
                apple -> apple.getWeight() > 100 && apple.getColor() == Color.GREEN);
        for (Apple apple : filteredApplesList1) {
            System.out.println(apple);
        }

        //
        System.out.println("============================================");

        List<Apple> filtered = filter(appleBasket, apple -> apple.getWeight() > 100 && apple.getWeight() <= 150);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenList = filter(numbers, n -> n % 2 == 0);
        for (Integer even : evenList) {
            System.out.print(even + " ");
        }

        List<String> wordList = List.of("moments", "hello", "apple", "gray", "sky", "rainbow");
        List<String> filteredWord = filter(wordList, str -> str.length() > 5);
        System.out.println("filteredWord = " + filteredWord);

        List<String> filter3 = wordList.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList());
        System.out.println("filter3 = " + filter3);

        makeLine();
        List<Color> colors = mappingAppleByColor(appleBasket);

        makeLine();

        // 회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member( "abc1@ddd.com", "1234", "홍길동", 1, Gender.MALE, 33)
                ,new Member( "abc2@ddd.com", "4444", "김길동", 2, Gender.FEMALE, 23)
                ,new Member( "abc3@ddd.com", "3333", "이길동", 3, Gender.MALE, 43)
                ,new Member( "abc4@ddd.com", "5555", "박길동", 4, Gender.FEMALE, 53)
                ,new Member( "abc5@ddd.com", "1111", "송길동", 5, Gender.MALE, 63)
        );

        List<Gender> genderList = map(memberList, m -> m.gender);
        System.out.println(genderList);

    }
}
