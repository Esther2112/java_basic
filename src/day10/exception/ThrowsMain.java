package day10.exception;

import java.util.InputMismatchException;

public class ThrowsMain {

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();
        try {
            int n = te.inputNumber();
            int m = te.convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수 입력 잘해라");
        } catch (NumberFormatException e) {
            System.out.println("숫자변 환 못함");
        }
    }
}
