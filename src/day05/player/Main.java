package day05.player;

public class Main {

    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player princess = new Player("딸긔겅듀");
        System.out.println("=============================");
        Player noname = new Player();

        princess.attack(parking);

//        System.out.println("주차왕 남은 체력 : " + parking.hp);
//        System.out.println("parking의 주소 : " + parking);

    }
}
