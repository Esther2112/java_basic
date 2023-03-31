package day05.member;

//회원 저장소
public class MemberRepository {

    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("abc@gmail.com", "1212", "콩순이", 1, Gender.FEMALE, 32);
        memberList[1] = new Member("ewr@gmail.com", "2323", "팥순이", 2, Gender.FEMALE, 43);
        memberList[2] = new Member("dsf@gmail.com", "3434", "빙수", 3, Gender.MALE, 23);

    }

    //회원목록 출력 기능
    void showMembers(){
        System.out.printf("====== 현재 회원정보 (총 %d명) ======\n", memberList.length);

        for (Member member : memberList) {
            System.out.println(member.inform());
        }
    }

    //회원 가입 기능
    //param1 - newMember: 가입하는 회원의 정보
    //return - 회원가입 성공여부. 성공시 true, 이메일이 중복되어 실패시 false
    boolean addMember(Member newMember){

        //이메일 중복체크
        if(isDuplicatedEmail(newMember.email)){
            return false;
        }
        //실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        return true;
    }
    //이메일의 중복여부를 확인하는 기능
    //param1 targetEmail : 검사대상 이메일
    //return : 중복되었을시 true, 사용가능할시 false
    boolean isDuplicatedEmail (String targetEmail){
        for (Member member : memberList) {
            if(targetEmail.equals(member.email)){
                return true;
            }
        }
        return false;
    }

    //마지막 회원의 번호를 알려주는 기능
    int getLastMemberId(){
        return memberList[memberList.length - 1].memberId;
    }


}
