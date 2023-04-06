package day09.abs;

public class Main {

    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("해피", "푸들", 2),
                new Dog("뽀삐", "치와와", 5),
                new Dog("구름이", "비숑", 1),
                new Cat("누룽지", "코숏", 6)
        };

        for (Pet pet : pets) {
            pet.eat();
        }

//        추상클래스는 객체를 생성할 수 없다
//        Pet newPet = new Pet();
    }
}
