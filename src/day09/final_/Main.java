package day09.final_;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person(
                "김철수",
                "000111-2123123",
                new BackPack(5, "샘소나이트")
        );

        kim.name = "김출수";
//        kim.ssn = "000111-1123123";
//        kim.backPack = new BackPack(10, "시장");


    }
}
