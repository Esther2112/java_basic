package day10.generic;

import day09.quiz2.Singer;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

//        BananaBasket bb = new BananaBasket();
//        bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");
        System.out.println(sl);

        MyList<Integer> nbs = new MyList<>();
        nbs.push(1);
        nbs.push(4);
        nbs.push(30);
        System.out.println(nbs);

        MyList<Singer> singers = new MyList();
        singers.push(new Singer());
    }
}
