package day07.inherit;

import day07.util.Utility;

import javax.swing.*;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    //썬더볼트
    public void thunderBolt(Player ... targets) {
        System.out.printf("# %s님 썬더볼트 시전!!\n", this.nickName);
        Utility.makeLine();
        for (Player target : targets) {
            if(target == this){
                continue;
            }else {
                int damage = (int) (Math.random() * 6) + 10;
                target.hp -= damage;
                System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력 : %d)\n", target.nickName, damage, target.hp);
            }
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + this.mana);
    }
}
