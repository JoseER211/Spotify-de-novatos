package Spotify;

import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs = new ArrayList<>();


    public Library() {
        songs.add(new Song("I'm yours", 1, 2012, 209, "Pop", "https://acortar.link/KctzJg",
                "primera canción de Jason Mraz de su tercer álbum de estudio We Sing. We Dance. We Steal Things."));
        songs.add(new Song("Zankoku na Tenshi no Thesis", 2, 1995, 401, "J-pop", "https://acortar.link/0LR5TA",
                "Opening #1 de Neon Genesis Evangelion"));
        songs.add(new Song("I'm yours", 3, 2015, 609, "Pop", "image",
                "Buena opción para dedicarla a tu pareja"));
        songs.add(new Song("I'm yours", 4, 2016, 509, "Pop", "image",
                "Buena opción para dedicarla a tu pareja"));

    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }



    @Override
    public String toString() {
        return "Library{" +
                "songs=" + songs +
                '}';
    }
}
