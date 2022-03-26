package Spotify;


public class Song {
    private String title;
    private Integer id;
    private Integer year;
    private Integer duration;
    private String genre;
    private String mask;
    private String description;

    public Song(String title, Integer id, Integer year, Integer duration, String genre, String mask, String description) {
        this.title = title;
        this.id = id;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.mask = mask;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", mask='" + mask + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n";

    }
}
