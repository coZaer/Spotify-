package spotify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MusicManager music = new MusicManager();
        String setir="                            ╔═════════════════════════════════════════════════╗ " + "\n" +
                "                            ║                       ⚪                        ║" + "\n" +
                "                            ║╔═══════════════════════════════════════════════╗║" + "\n" +
                "                            ║║ 17:40                             🔊🛜📶100🔋║║ " + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                  🎵spotify🎵                 ║║ " + "\n" +
                "                            ║║ premium almaq isteyirsiz yoxsa pulsuz istifade║║" + "\n" +
                "                            ║║             etmek isteyirsiz?                 ║║" + "\n" +
                "                            ║║                    1.beli. 😊                 ║║ " + "\n" +
                "                            ║║     2.xeyr, pulsuz paketde qalma isteyirem. 😞║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║║                                               ║║" + "\n" +
                "                            ║╚═══════════════════════════════════════════════╝║ " + "\n" +
                "                            ║║                 ╔═════════╗                   ║║" + "\n" +
                "                            ║║                 ╚═════════╝                   ║║" + "\n" +
                "                            ╚═════════════════════════════════════════════════╝";
        System.out.print(setir);
        int question = sc.nextInt();
        if (question == 1) {
            telefonCercivesindeGoster("premiumda siz reklam almiyacaqsiniz ve musiqini oflayn dinleyib sile bileceksiniz eger almaq isteyirsizse \n"+" 1.beli almaq isteyirem.😊\n "+"2.xeyr,pulsuz spotify istifade etmek isteyirem.😞");
            System.out.println("Men👦🏻:");
            question = sc.nextInt();
            if (question == 1) {
                Scanner sc1 = new Scanner(System.in);
                while (true) {

                    telefonCercivesindeGoster(" 1.Musiqi melumatlarini elave et(id,adini ve musiqi) \n 2.Daxil edilen musqiqinin parametrlerini deyisin\n 3.Daxil edilen musiqi melumatlarini sil\n 4.Musiqilerin melumatlarini getir\n 5.Ifacinin musiqilerini getir\n 6.Sistemden cix");
                    System.out.println("Men👦🏻:");
                    int emeliyyat = sc.nextInt();
                    switch (emeliyyat) {
                        case 1:
                            telefonCercivesindeGoster("Idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            int id = sc1.nextInt();
                            telefonCercivesindeGoster("Musiqini daxil edin:");
                            System.out.println("Men👦🏻:");
                            String musicName = sc1.next();
                            telefonCercivesindeGoster("Musiqicini adini daxil edin:");
                            System.out.println("Men👦🏻:");
                            String singer = sc1.next();
                            music.add(new Music(id, musicName, singer));
                            break;
                        case 2:
                            telefonCercivesindeGoster("Deyismek istediyiniz idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            id = sc1.nextInt();
                            telefonCercivesindeGoster("Yeni idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            int id1 = sc.nextInt();
                            telefonCercivesindeGoster("Yeni musiqini daxil edin:");
                            System.out.println("Men👦🏻:");
                            musicName = sc1.next();
                            telefonCercivesindeGoster("Yeni musiqicini adini daxil edin:");
                            System.out.println("Men👦🏻:");
                            singer = sc1.next();
                            music.update(id, new Music(id1, musicName, singer));
                            break;
                        case 3:
                            telefonCercivesindeGoster("Silmek istediyiniz idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            id = sc1.nextInt();
                            music.delete(id);
                            break;
                        case 4:
                            telefonCercivesindeGoster("Musiqi haqqinda melumat ucun idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            id = sc1.nextInt();
                            telefonCercivesindeGoster(music.getMusic(id));
                            break;
                        case 5:
                            telefonCercivesindeGoster("Istediyiniz musiqicinin musiqilerini getirmek ucun musiqicinin adini daxil edin:");
                            System.out.println("Men👦🏻:");
                            singer = sc1.next();
                            Music[] singerMusics = music.getSingerMusics(singer);
                            String musics="";
                            for (int i = 0; i < singerMusics.length; i++) {
                                musics+=singerMusics[i].toString();
                            }
                            telefonCercivesindeGoster(musics);
                            break;
                        case 6:
                            telefonCercivesindeGoster("Spotifydan cixdiniz😞");
                            sc.close();
                            sc1.close();
                            return;
                        default:
                            telefonCercivesindeGoster("Sehv emeliyyat daxil etmisiniz! Yeniden daxil edin zehmet olmasa😊");

                    }
                }
            } else {
                while (true) {
                    telefonCercivesindeGoster("Siz pulsuz spotifydan istifade edirsiz ona gorede ancaq musiqi elave edib sile bilersiz ve oflyan istifade ede bilmezsiniz.😞");
                    Scanner sc1 = new Scanner(System.in);
                    telefonCercivesindeGoster("Emeliyyat daxil edin:\n 1.Musiqi elave et\n 2.Musiqi sil \n3.Spotifydan cix");
                    System.out.println("Men👦🏻:");
                    int emeliyyat = sc1.nextInt();
                    switch (emeliyyat) {
                        case 1:
                            telefonCercivesindeGoster("Idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            int id = sc1.nextInt();
                            telefonCercivesindeGoster("Musiqini daxil edin:");
                            System.out.println("Men👦🏻:");
                            String musicName = sc1.next();
                            telefonCercivesindeGoster("Musiqicini adini daxil edin:");
                            System.out.println("Men👦🏻:");
                            String singer = sc1.next();
                            music.add(new Music(id, musicName, singer));
                            break;
                        case 2:
                            telefonCercivesindeGoster("Silmek istediyiniz idni daxil edin:");
                            System.out.println("Men👦🏻:");
                            id = sc1.nextInt();
                            music.delete(id);
                            break;
                        case 3:
                            telefonCercivesindeGoster("Spotifydan cixdiniz");
                            sc.close();
                            sc1.close();
                            return;
                        default:
                            telefonCercivesindeGoster("Sehv emeliyyat daxil etmisiniz! Yeniden daxil edin zehmet olmasa");
                    }
                }
            }
        } else {
            while (true) {
            telefonCercivesindeGoster("Siz pulsuz spotifydan istifade edirsiz ona gorede ancaq musiqi elave edib sile bilersiz.😞 "+"\n"+
                    "Emeliyyat daxil edin:"+"\n "+"1.Musiqi elave et"+"\n"+" 2.Musiqi sil"+"\n"+" 3.Sistemden cix");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Men👦🏻:");
            int emeliyyat = sc1.nextInt();
            switch (emeliyyat) {
                case 1:
                    telefonCercivesindeGoster("Idni daxil edin:");
                    System.out.println("Men👦🏻:");
                    int id = sc1.nextInt();
                    telefonCercivesindeGoster("Musiqini daxil edin:");
                    System.out.println("Men👦🏻:");
                    String musicName = sc1.next();
                    telefonCercivesindeGoster("Musiqicini adini daxil edin:");
                    System.out.println("Men👦🏻:");
                    String singer = sc1.next();
                    music.add(new Music(id, musicName, singer));
                    break;
                case 2:
                    telefonCercivesindeGoster("Silmek istediyiniz idni daxil edin:");
                    System.out.println("Men👦🏻:");
                    id = sc1.nextInt();
                    music.delete(id);
                    break;
                case 3:
                    telefonCercivesindeGoster("Spotifydan cixdiniz");
                    sc.close();
                    sc1.close();
                    return;
                default:
                    telefonCercivesindeGoster("Sehv emeliyyat daxil etmisiniz! Yeniden daxil edin zehmet olmasa");
            }
        }
        }
    }
    public static void telefonCercivesindeGoster(String mesaj) {

        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
        String yuxariHisse="                            ╔═════════════════════════════════════════════════╗"+"\n"+
                "                            ║                       ⚪                        ║"+"\n"+
                "                            ║╔═══════════════════════════════════════════════╗║"+"\n"+
                "                            ║║ 17:40                             🔊🛜📶100🔋║║"+"\n"+
                "                            ║║                                               ║║"+"\n"+
                "                            ║║                  🎵spotify🎵                 ║║ ";
        String asagiHisse = "                            ║╚═══════════════════════════════════════════════╝║"+"\n"+
                "                            ║║                 ╔═════════╗                   ║║" + "\n" +
                "                            ║║                 ╚═════════╝                   ║║"+ "\n"+
                "                            ╚═════════════════════════════════════════════════╝";
        String bosHisse= "                            ║║                                               ║║";


        System.out.println(yuxariHisse);

        String[] setirler = mesaj.split("\n");

        for (int i = 0; i < setirler.length; i++) {
            String setir = setirler[i];

            while (setir.length() > 45) {
                System.out.println("                            ║║ " + setir.substring(0, 45) + " ║║");
                setir = setir.substring(45);
            }

            int bosluq = (45 - setir.length()) / 2;
            String formatliSetir = bosluqYarat(bosluq) + setir + bosluqYarat(45 - bosluq - setir.length());
            System.out.println("                            ║║ " + formatliSetir + " ║║");
        }


        for (int i = setirler.length; i < 10; i++) {
            System.out.println(bosHisse);
        }

        System.out.println(asagiHisse);


    }


    public static String bosluqYarat(int say) {
        StringBuilder bosluq = new StringBuilder();
        for (int i = 0; i < say; i++) {
            bosluq.append(" ");
        }
        return bosluq.toString();
    }


}
