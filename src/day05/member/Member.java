package day05.member;

import java.time.LocalDate;

import static day05.member.Gender.MALE;
//역할: 1명의 회원정보를 묶어주는 역할
//Java Bean(VO)
public class Member {

    public String email;
    public String password;
    public String memberName;
    public int memberId;
    public Gender gender;
    public int age;

    public Member(String email, String password, String memberName, int memberId, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.memberId = memberId;
        this.gender = gender;
        this.age = age;
    }

    //회원가입일
    LocalDate regDate;

    //회원의 정보를 문자열로 만들어서 리턴하는 기능
    String inform(){
        String convertGender = gender == Gender.MALE ? "남성" : "여성";
        return String.format("# %d번 | %s | %s | %s | %d세"
                            , memberId, this.email, memberName, convertGender, this.age);
    }

}
