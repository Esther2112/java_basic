package day05.player;

public class Player {
    //필드
    String nickname; //캐릭터 네임
    int level; //레벨
    int hp;//체력

    //생성자
    public Player(){
        this("이름없음");
        System.out.println("1번 생성자 호출!");
    }
    public Player(String nickname) {
        this(nickname, 1, 50);
        System.out.println("2번 생성자 호출!");
//        this.nickname = nickname;
//        this.level = 1;
//        this.hp = 50;
    }
    public Player(String nickname, int level, int hp) {
        System.out.println("3번 생성자 호출!");
        this.nickname = nickname;
        this.level = level;
        this.hp = hp;
    }

    //기능 - 메서드
    void attack(Player target){
        if(this == target){
            return;
        }
        //맞은 캐릭터의 체력이 10~15 랜덤으로 감소
        int damage = (int)(Math.random() * 6) + 10;
        target.hp -= damage;
        //전투 로그 출력
        //가해자가 피해자를 공격해서 xxx의 피해를 입힘
        System.out.printf("%s이 %s에게 %d의 피해를 입힘!\n", this.nickname, target.nickname, damage);
//        System.out.println("target의 주소 : " + target);
    }




}
