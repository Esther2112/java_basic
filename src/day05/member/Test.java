package day05.member;

import static day05.member.Gender.FEMALE;
import static day05.member.Gender.MALE;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("rgre@sfs.com", "5555", "밥도둑", 4, MALE, 50);
        mr.addMember(thief);
//        mr.showMembers();
        
        boolean flag = mr.isDuplicatedEmail("rgre@sfs.com");
        System.out.println("flag = " + flag);
    }
}
