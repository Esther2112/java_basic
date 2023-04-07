package day10.exception;

public class UserMain {

    public static void main(String[] args) {

        LoginUser loginUser = new LoginUser("abc123", "1234");
        try {
            loginUser.loginValidate("abc1234", "1111");
        } catch (Exception e) {
            //getMassage: 에러원인 메시지를 리턴
            System.out.println(e.getMessage());
        }
    }
}
