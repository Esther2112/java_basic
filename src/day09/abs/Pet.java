package day09.abs;

// 추상화
//1. 객체 생성 불가
//2. 메서드는 오버라이딩을 위해 선언만으로 제한
public abstract class Pet {
    private String name;
    private String kind;
    private int age;

    public Pet() {
    }

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //오버라이딩을 위한 메서드
    public abstract void takeNap();

    public abstract void eat();
}
