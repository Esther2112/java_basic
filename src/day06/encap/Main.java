package day06.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

//        myCar.model = "페라리";
//        myCar.speed = 10000;

        myCar.setSpeed(500);

        System.out.println(myCar.getSpeed());


        myCar.pressButton();
    }
}
