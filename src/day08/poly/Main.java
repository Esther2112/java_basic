package day08.poly;

public class Main {
    public static void main(String[] args) {

        //객체는 항상 역할에 의존해야하지 구현체에 의존하면 안 된다
        Computer com = new Computer();
        LgMonitor lgMonitor = new LgMonitor();

        com.monitor = lgMonitor;

        //모니터 교환
        com.monitor = new HpMonitor();

    }
}
