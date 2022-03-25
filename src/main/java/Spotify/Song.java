package Spotify;

import java.sql.Time;
import java.util.Date;

public class Song {
    private String title;
    private Integer id;
    private Date date;
    private Time duration;
    private String genre;
    private String mask;
    private String description;

    public Song(String title, Integer id, Date date, Time duration, String genre, String mask, String description) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.mask = mask;
        this.description = description;
    }
}
