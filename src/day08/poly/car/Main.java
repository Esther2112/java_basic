package day08.poly.car;

import day07.util.Utility;

import static day07.util.Utility.*;

public class Main {
    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();
        park.drive(new Stinger());

        makeLine();

        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Car car = shop.exportCar(6000);

        if (car instanceof Mustang) {
            Mustang car1 = (Mustang) car;
            mustang.accelerate();
            car1.powerSound();
        }

    }
}
