package day09.quiz2;

public class Singer {

    private String name;
    private String song;
    private String[] songList;

    public Singer() {
    }

    public Singer(String name) {
        this.name = name;
    }

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
        addSong(song);
    }

    public void addSong(String songName) {
//        this.songList = getSongList();
        if (songList == null) {
            songList = new String[1];
            songList[0] = songName;
        } else {
            for (String s : songList) {
                if (s.equals(songName)) {
                    System.out.printf("# [%s]은(는) 이미 등록된 노래입니다.\n", songName);
                    return;
                }
            }
            String[] temp = new String[songList.length + 1];
            for (int i = 0; i < songList.length; i++) {
                temp[i] = songList[i];
            }
            temp[temp.length - 1] = songName;
            setSongList(temp);
            System.out.printf("# %s님의 노래목록에 [%s]곡이 추가되었습니다.\n", this.getName(), songName);
//            viewSongList();
        }
    }

    public void viewSongList() {
        if (this.songList == null) {
            System.out.println("# 아직 등록된 곡이 없습니다");
        } else {
            for (int i = 0; i < songList.length; i++) {
                System.out.printf("* %d. %s\n", i + 1, songList[i]);
            }
        }
    }

    public String[] getSongList() {
        return this.songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setSongList(String[] songList) {
        this.songList = songList;
    }
}
