package day03;

public class MethodBasic {

    // 함수 : 코드블록의 기능적 표현
    //ex ) add(10, 20);
    // 메서드 : 객체의 동작 표현
    //ex ) 샤프계산기.add(10, 20);

    //자바는 모든 것을 객체고 표현하고, 함수마저도 모두 메서드로 처리한다.
    //자바의 메서드는 클래스 내부에서만 선언이 가능
    //다른 메서드 안에서 메서드를 중첩 선언할 수 없다.

    //2개의 정수를 더해서 리턴하는 메서드
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    // 여러 값을 리턴하고 싶으 ㄴ경우
    // 2개 정수를 전달하면 덧셈, 뺄셈, 곱셈 결과를 리턴
    static int[] operateAll(int number1, int number2) {
        return new int[]{
                number1 + number2,
                number1 - number2,
                number1 * number2
        };
    }

    // n개의 정수를 전달받아 총합을 리턴
//    static int addAll(int[] numbers) {
    static int addAll(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // 2개의 정수 배열을 전달받아 들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
    int[] compareNumbers(int[] arr1, int[] arr2){
        return arr1.length > arr2.length ? arr1 : arr2;
    }

    public static void main(String[] args) {
        int result = add(2, 3);
        System.out.println("result = " + result);

//        int r1 = addAll(new int[]{10, 20, 30});
        int r1 = addAll(10, 20, 30);
        System.out.println(r1);
    }
}
