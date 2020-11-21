/*
NATHAN MORRIS
UNIVERSITY OF PITTSBURGH AT BRADFORD
CIST 1450 - FALL 2020
HOMEWORK 3
 */

public class Song {
    //Attributes
    private String title;
    private String artist;
    private String genre;

    //Define Song object
    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    //Getters
    public String getTitle() {
        return this.title;
    }
    public String getArtist() { return this.artist;}
    public String getGenre() { return this.genre;}

    //Setters
    public void setTitle (String title) {
        this.title = title;
    }
    public void setArtist (String artist) { this.artist = artist;}
    public void setGenre (String genre) { this.genre = genre;}
}
