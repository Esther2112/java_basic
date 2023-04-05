package day08.poly.car;

//자동차 판매 대리점
public class CarShop {

    Car[] cars;
//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;

    //대리점에 차를 입고하는 기능
    public void importCar() {
        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson()
        };

        //문자열과 정수와 논리를 배열에 담을 수 있는가?
//        Object[] oArr = {
//          50, 20, 3.3, "ㅋㅋ", false, new Mustang()
//        };
    }

    //주행테스트 기능
    public void runTest() {
        importCar(); //차입고
        for (Car car : cars) {
            car.accelerate();
        }
    }

    //차를 고객에게 인동하는 기능
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money == 3000) {
            return new Tucson();
        } else {
            return null;
        }
    }
}