package day07.lotto;

import day07.util.Utility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LottoSimulator {
    public static void run(){
        int buyCount = 1;

            //로또 번호 고르기
            Scanner sc = new Scanner(System.in);
            int[] buyLotto = new int[6];
            System.out.println("구매번호를 6개 차례대로 입력하세요");
            int num = 0;
            while (num < 6) {
                System.out.print((num + 1) + "번째 번호 >> ");
                buyLotto[num] = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < num; j++) {
                    if (buyLotto[num] == buyLotto[j]) {
                        System.out.println("이미 선택한 번호입니다");
                        num--;
                    }
                }
                num++;
            }
            System.out.println(Arrays.toString(buyLotto));

        while(true) {
            //로또 번호 매칭하기
            int[] lucky = Lotto.information();
//        System.out.println(Arrays.toString(lucky));
            int matchCount = 0;
            for (int i = 0; i < buyLotto.length; i++) {
                for (int j = 0; j < lucky.length; j++) {
                    if (buyLotto[i] == lucky[j]) {
                        matchCount++;
                    }
                }
            }
            if (matchCount == 6) {
                System.out.println(buyCount + "번 만에 당첨되었습니다!");
                break;
            } else {
                buyCount++;
                System.out.println(buyCount + "번째 구매...ㅠㅠ");
            }
        }

    }
}
