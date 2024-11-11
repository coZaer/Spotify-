package spotify;

public interface MusicServices {
    void add(Music music);
    void update(int id,Music music);
    void delete(int id);
    String getMusic(int id);
    Music[] getSingerMusics(String singer);
}
