package day03;

public class MethodQuiz {
    static void printFoods(){
        for (String food : foods) {
            System.out.printf("%4s ", food);
        }
        System.out.println();
    }

    static void push(String food){
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = food;
        foods = temp;
        temp = null;
    }

    static int indexOf(String food){
        int targetIndex = -1;
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].equals(food)){
                targetIndex = i;
            }
        }
        return targetIndex;
    }

    static void remove(String food){
        int targetIndex = indexOf(food);
        if(targetIndex == -1){
            System.out.println("존재하지 않는 음식명입니다");
        }else {
            for (int i = targetIndex; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            String[] temp = new String[foods.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
            foods = temp;
            temp = null;
        }
    }

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println(idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();




    }
}
