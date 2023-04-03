package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {
    void test(){
        A a = new A();
        a.f1 = 10; //public
//        a.f2 = 20; // default (같은 패키지 내에서만 접근 가능)
//        a.f3 = 30; //private (같은 클래스 내에서만 접근 가능)

        a.m1(); //public
//        a.m2(); // default (같은 패키지 내에서만 접근 가능)
//        a.m3(); //private (같은 클래스 내에서만 접근 가능)

//        B b = new B(); //B클래스가 default 레벨이므로 C클래스에서는 접근 불가
    }

}
