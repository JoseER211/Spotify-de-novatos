package Spotify;

import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs = new ArrayList<>();


    public Library() {
        songs.add(new Song("I'm yours", 1, 2012, 209, "Pop", "image",
                "Buena opción para dedicarla a tu pareja"));
        songs.add(new Song("titulo", 2, 2015, 109, "Pop", "image",
                "Buena opción para dedicarla a tu pareja"));
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
