package day13.Comparator;

import day06.modi.pac2.C;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79),
                        new Student("김나나", 16, 90),
                        new Student("박보라", 13, 43),
                        new Student("최뚜비", 18, 82)
                )
        );

        //나이 순으로 오름차 정렬 ( 나이 적은 순 )
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());

        //이름 가나다순 오름차정렬
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        studentList.forEach(s -> System.out.println(s));


    }
}
