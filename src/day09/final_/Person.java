package day09.final_;

class SmartBackPack extends BackPack {
    public SmartBackPack(int size, String brand) {
        super(size, brand);
    }
    public void getItem(){

    }
}
class BackPack {
    // 속성
    int size; //가방크기(1 ~ 10)
    String brand; //브랜드
    //기능
    final void putItem() {
        System.out.println("가방에 물건을 넣습니다.");
    }
    void getItem() {

    }

    public BackPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

}
public class Person {

    String name;
    final String ssn; //주민번호

    //상수: 불변성, 유일성
    static final String nationality;
    final BackPack backPack; //가방
    static {
        nationality = "대한민국";
    }

    public Person(String name, String ssn, BackPack backPack) {
        this.name = name;
        this.ssn = ssn;
        this.backPack = backPack;
    }

}
