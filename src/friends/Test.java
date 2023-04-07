package friends;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        People kim = new People("김철수");
        People hong = new People("홍길동");
        People yim = new People("임걱정");

        kim.addFollowRequests(hong);
        kim.addFollowRequests(yim);
        kim.addFollowers(hong);

        List<String> kimsList = kim.showFollowRequests();
        System.out.println("kim'sList = " + kimsList);


    }
}
