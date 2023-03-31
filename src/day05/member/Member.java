package day05.member;

import static day05.member.Gender.MALE;

public class Member {

    String email;
    String password;
    String memberName;
    int memberId;
    Gender gender;
    int age;

    public Member(String email, String password, String memberName, int memberId, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.memberId = memberId;
        this.gender = gender;
        this.age = age;
    }

    //회원의 정보를 문자열로 만들어서 리턴하는 기능
    String inform(){
        String convertGender = gender == Gender.MALE ? "남성" : "여성";
        return String.format("# %d번 | %s | %s | %s | %d세"
                            , memberId, this.email, memberName, convertGender, this.age);
    }

}
