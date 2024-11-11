package spotify;

public class Music {
    private int id;
    private String musicName;
    private String singer;

    public Music(int id, String musicName, String singer) {
        this.id = id;
        this.musicName = musicName;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
               ", musicName='" + musicName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
