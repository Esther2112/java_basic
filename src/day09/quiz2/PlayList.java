package day09.quiz2;

import static day07.util.Utility.*;

public class PlayList {

    private Singer[] singerList;

    public void setSingerList() {
        singerList = new Singer[4];
        singerList[0] = new Singer("동방신기", "하루만니방의");
        singerList[1] = new Singer("에이핑크", "U");
        singerList[2] = new Singer("아이유", "좋은날");
        singerList[3] = new Singer("박진영");
    }
    public Singer[] getSingerList(){
        return singerList;
    }

    public void addSong() {
        System.out.println("# 노래 등록을 시작합니다");
        System.out.print("- 가수명: ");
        String name = sc.nextLine();
        System.out.print("- 곡명: ");
        String song = sc.nextLine();

//        singerList = getSingerList();
        boolean inList = isExist(name);
        if (inList) {
            int index = findIndexByName(name);
            singerList[index].addSong(song);
        } else {
            addSinger(name, song);
        }
    }

    public boolean isExist(String name) {
        for (Singer singer : getSingerList()) {
            if (singer.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int findIndexByName(String name) {
        int index = -1;
        Singer[] singerList = getSingerList();
        for (int i = 0; i < singerList.length; i++) {
            if (singerList[i].getName().equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public void addSinger(String name, String song) {
        singerList = getSingerList();
        Singer[] temp = new Singer[singerList.length + 1];
        for (int i = 0; i < singerList.length; i++) {
            temp[i] = singerList[i];
        }
        temp[temp.length - 1] = new Singer(name, song);
        singerList = temp;
        System.out.printf("# 아티스트 %s님이 신규 등록되었습니다\n", name);
    }

    public void searchSong() {
        System.out.println("# 검색할 가수명을 입력하세요");
        System.out.print("가수명: ");
        String singerName = sc.nextLine();
        boolean inList = isExist(singerName);
        if (inList) {
            int index = findIndexByName(singerName);
            Singer who = singerList[index];
            System.out.printf("# %s님의 노래목록\n", who.getName());
            System.out.println("==============================");
            who.viewSongList();
        } else {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }
    }
    public void pause(){
        System.out.println("# 엔터를 누르시면 메뉴로 이동합니다");
        sc.nextLine();
    }

    public void playList() {
            setSingerList();
        while (true) {
            System.out.println("**** 음악 관리 프로그램 ****");
            System.out.printf("# 현재 등록된 가수: %d명\n", singerList.length);
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("==============================");
            System.out.print(">> ");
            String select = sc.nextLine();
            switch (select) {
                case "1":
                    addSong();
                    pause();
                    break;
                case "2":
                    searchSong();
                    pause();
                    break;
                case "3":
                    System.out.println("**** 프로그램을 종료합니다 ****");
                    System.exit(0);
                default:
                    System.out.println("# 1 ~ 3 중 원하시는 메뉴의 번호를 입력해주세요.");
                    pause();
            }
        }

    }

}
