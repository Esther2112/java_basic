package day03;

public class ArraySearch {
    public static int indexOf(String target){
        //인덱스 탐색 알고리즘
        int index = -1;
        for(int i = 0; i < foods.length; i++){
            if(target.equals(foods[i])){
                index = i;
                break;
            }
        }
        return index;
    }
    static String[] foods = {"삼겹살", "두루치기", "족발", "치킨"};
    public static void main(String[] args) {

    int index = indexOf("두루치기");

        System.out.println("찾은 인덱스 : " + index);






    }
}






