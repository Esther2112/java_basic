package day10.collection.map;

import day09.quiz2.Singer;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        //put(K, V): 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("가수", new Singer("아이유"));
        map.put("저녁메뉴", "볶음밥");

        System.out.println(map.size());

        //get(key): 데이터 참조
        Object dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);
        Object singer = (Singer) map.get("가수");

        System.out.println("map = " + map);

        map.put("저녁메뉴", "짬뽕"); //추가가 아니라 수정이 됨 due to 이미 존재하는 키.

        //반복문 처리
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }


    }
}
