/*
NATHAN MORRIS
UNIVERSITY OF PITTSBURGH AT BRADFORD
CIST 1450 - FALL 2020
HOMEWORK 3
 */

import java.util.Hashtable;

public class SongCollection {
    //Attributes
    private String name;
    private Hashtable<String, Song> songs;

    //Define SongCollection object
    public SongCollection(String name) {
        this.name = name;
        songs = new Hashtable<String, Song>();
    }

    // Get Methods
    public Hashtable getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }


    // Set Methods
    public void setName (String name) {
        this.name = name;
    }
    public void setSongs (Hashtable songs) {
        this.songs = songs;
    }

    public Song lookUpSong(String title) {
        return this.songs.get(title);
    }

    public void addSong (Song song) {
        this.songs.put(song.getTitle(), song);
    }

    //Define print style for printing song objects (used in printing library)
    public void printSongs() {
        this.songs.forEach((title, song) -> {
            String artist = song.getArtist();
            String genre = song.getGenre();
            System.out.println("-------------");
            System.out.println("Title: " + title.toUpperCase());
            System.out.println("Artist: " + artist);
            System.out.println("Genre: " + genre);
        });
    }

    public Song loopUpSong(String title) {
        return this.songs.get(title);
    }
}
