package friends;

import java.util.ArrayList;
import java.util.List;

public class People {

    private String nickName;

    //팔로워 목록
    private List<People> followers;
    //팔로워 대기 목록
    private List<People> followRequests;
    //팔로잉 목록
    private List<People> followings;

    //생성자


    public People() {
    }

    public People(String nickName) {
        this.nickName = nickName;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.followRequests = new ArrayList<>();
    }

    //팔로우 요청한 사람을 대기목록에 추가하는 기능
    public void addFollowRequests(People requestPerson){
        this.followRequests.add(requestPerson);
    }
    //요청수락이 대기명단에서 팔로워 목록으로 이동
    public void addFollowers(People requestPerson){
        this.followers.add(requestPerson);
        this.followRequests.remove(requestPerson);
        requestPerson.followings.add(this);
    }
    //요청수락 대기중인 닉네임들을 보여주는 기능
    public List<String> showFollowRequests(){
        //대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitingNames = new ArrayList<>();
        for (People people : followRequests) {
            waitingNames.add(people.nickName);
        }
        return waitingNames;
    }

    //팔로워 목록을 보여주는 기능
    public List<String> showFollowers(){
        //닉네임만 저장할 리스트
        List<String> followerNames = new ArrayList<>();
        for (People people : followRequests) {
            followerNames.add(people.nickName);
        }
        return followerNames;
    }

}
