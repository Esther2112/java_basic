package day07.inherit;

public class Hunter extends Player {
    int concentration;

    public Hunter(String nickName) {
        super(nickName);
        this.level = 1;
        this.hp = 50;
        this.concentration = 100;
    }

    public void summonBeast(){

    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("# concentration :" + this.concentration);
    }
}
