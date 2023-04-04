package day07.inherit;

//수퍼클래스(부모클래스) : 객체의 공통 기능과 속성을 설계
//부모의 private member는 상속되지 않는다.
//단일 상속만 가능 (다중상속 불가)
public class Player {
    String nickName;
    int level;
    int hp;
    int exp;

    //부모의 생성자
    public Player() {
        System.out.println("Player의 생성자 호출!");
    }

    public Player(String nickName) {
        this.nickName = nickName;
    }

    //캐릭터 상태창을 보는 기능
    public void showStatus(){
        System.out.println("\n========= Character's Info ==========");
        System.out.println("# name : " + this.nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
    }
}
