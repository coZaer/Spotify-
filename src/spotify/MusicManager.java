package spotify;

public class MusicManager implements MusicServices {
    Music[] musics = new Music[100];
    int count = 0;

    @Override
    public void add(Music music) {
        if (count < musics.length) {
            musics[count++] = music;
            System.out.println("Musiqi elave olundu😊");
        } else {
            System.out.println("Musiqi ucun yer qalmamışdır😞");
        }
    }

    @Override
    public void update(int id,Music music) {
        for (int i = 0; i < count; i++) {
            if (musics[i].getId() == id) {
                musics[i]=music;
                System.out.println("Musiqinizin melumatlari deyisdi.😊\n");
                return;
            }
        }
        System.out.println("Bele bir musiqi yoxdur😞\n");

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (musics[i].getId() == id) {
                for (int j = i; j < count; j++) {
                    musics[j] = musics[j + 1];
                }
                musics[count - 1] = null;
                count--;
                System.out.println("musiqi silindi😊\n");
            }
        }
    }

    @Override
    public String getMusic(int id) {
        for (int i = 0; i < count; i++) {
            if (musics[i].getId() == id) {
                return musics[i].toString();
            }
        }
        return "Bele bir musiqi yoxdur😞\n";

    }

    @Override
    public Music[] getSingerMusics(String singer) {
        int scount = 0;

        for (int i = 0; i < count; i++) {
            if (musics[i].getSinger().equalsIgnoreCase(singer)) {
                scount++;
            }
        }
        Music[] singerMusics = new Music[scount];
        int j=0;
        for (int i = 0; i < count; i++) {
            if (musics[i].getSinger().equalsIgnoreCase(singer)) {
                singerMusics[j++]=musics[i];
            }

        }
        return singerMusics;
    }
}
