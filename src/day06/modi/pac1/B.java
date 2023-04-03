package day06.modi.pac1;

class B { //default 제한: 클래스에는 public과 default만 사용 가능
    public int x1;
    int x2;
    private int x3;
    void Test(){
        A a = new A();
        a.f1 = 1; //public (제한 없음)
        a.f2 = 2; //default (동일한 패키지 내 접근 가능)
//        a.f3 = 3; //private (동일 클래스 내에서만 접근 가능);

        a.m1();//public (제한 없음)
        a.m2();//default (동일한 패키지 내 접근 가능)
//        a.m3();//private (동일 클래스 내에서만 접근 가능);

    }
}
