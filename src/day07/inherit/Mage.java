package day07.inherit;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    //썬더볼트
    public void thunderBolt() {

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + this.mana);
    }
}
