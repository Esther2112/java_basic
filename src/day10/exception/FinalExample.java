package day10.exception;

public class FinalExample {

    public static void main(String[] args) {

        String[] pets = {"고양이", "거북이", "앵무새"};
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(pets[i] + "를 키울래용!!");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다~");
            } finally {
                //예외와 관계없이 항상 실행할 코드
                System.out.println("애완동물 조와용~");
            }
        }
        System.out.println("프로그램 정상 종료!");

    }
}
