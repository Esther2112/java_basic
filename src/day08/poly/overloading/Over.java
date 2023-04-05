package day08.poly.overloading;

/*
    오버로딩: 하나의 클래스 안에서 같은 이름의 메서드를 여러개 선언하는 것
    오버라이딩: 부모클래스의 메서드를 자식클래스에서 재정의하는 것

    오버로딩의 조건: 반드시 매개변수의 타입, 순서, 개수가 달라야 한다.
                  리턴타입과 접근제한자는 관련이 없다.
 */
public class Over {

    //데이터를 전달하면 데이터의 타입을 알려주는 기능

    void alertType(String s){
        System.out.println("전달된 데이터는 문자열입니다");
    }
    void alertType(int i) {
        System.out.println("전달된 데이터는 정수입니다");
    }
    void alertType(double d) {
        System.out.println("전달된 데이터는 실수입니다");
    }
    void alertType(int x, String y) {
        System.out.println("전달된 데이터는 정수와 문자열입니다");
    }
    void alertType(String y, int x) {
        System.out.println("전달된 데이터는 문자열과 정수입니다");
    }
    void alertType(int x, int y) {
        System.out.println("전달된 데이터는 정수 두 개입니다");
    }

    void test(){
        alertType("zzz", 3);
        System.out.println();
    }

}
