/**
 * Creates a song with attributes
 *
 * Class: ICS4U1
 * Date: May 01 2022
 * @author James Wong
 */
import java.util.*;

public class Song extends Playable {

    /* attribute */

    /** the artist of the song */
    private String artist;
    /** the album of the song */
    private String album;
    /** the genre of the song */
    private String genre;

    /* constructors */

    /**
     Name: Song
     Description: creates a song
     @param title title of the song
     @param artist artist of the song
     @param album album of the song
     @param genre genre of the song
     @param totalTime total time of the song
     */
    public Song(String title, int totalTime, String artist, String album, String genre){

        super(title, totalTime);

        this.artist = artist;
        this.album = album;
        this.genre = genre;

    }

    /* accessors */

    /**
     Name: getArtist
     Description: return the song artist
     @return the artist of the song
     */
    public String getArtist() {return this.artist;}

    /**
     Name: getAlbum
     Description: return the song album
     @return the album of the song
     */
    public String getAlbum() {return this.album;}

    /**
     Name: getGenre
     Description: return the song genre
     @return the genre of the song
     */
    public String getGenre() {return this.genre;}

    /* mutators */

    /**
     * Name: artist
     * Description: set the artist name
     * @param  newArtist new possible artist
     */
    public void setArtist(String newArtist){
        if (newArtist.length()>0) {
            this.artist = newArtist;
        }
    }

    /**
     * Name: album
     * Description: set the album name
     * @param  newAlbum new possible artist
     */
    public void setAlbum(String newAlbum) {
        if (newAlbum.length()>0) {
            this.album = newAlbum;
        }
    }

    /**
     * Name: genre
     * Description: set the artist name
     * @param  newGenre new possible artist
     */
    public void setGenre(String newGenre){
        if (newGenre.length()>0) {
            this.genre = newGenre;
        }
    }

    /* other methods */

    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public String toString() {
        String attributes;

        System.out.println(super.toString());
        attributes = "Artist: " + this.artist +  "\nAlbum: " + this.album + "\nGenre: " + this.genre;

        return attributes;
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {

        // constructor
        // String title, int totalTime, String artist, String album, String genre
        Song mySong = new Song("Secrets", 240, "The Weeknd", "Starboy", "Hip-Hop");

        // accessors
        System.out.println();
        System.out.println("ACCESSORS"); // accessor for each attribute

        System.out.println("Artist: " + mySong.getArtist());
        System.out.println("Album: " + mySong.getAlbum());
        System.out.println("Genre: " + mySong.getGenre());

        // mutators
        System.out.println();
        System.out.println("MUTATORS"); // all mutators for each attribute

        System.out.println("catching if the artist is less then 1 character");
        mySong.setArtist("");   // invalid
        System.out.println(mySong.getArtist());
        mySong.setArtist("Frank Ocean"); // valid
        System.out.println(mySong.getArtist());

        System.out.println("catching if the album is less then 1 character");
        mySong.setAlbum("");    // invalid
        System.out.println(mySong.getAlbum());
        mySong.setAlbum("Alone at Prom");   // valid
        System.out.println(mySong.getAlbum());

        System.out.println("catching if the genre is less then 1 character");
        mySong.setGenre("");    // invalid
        System.out.println(mySong.getGenre());
        mySong.setGenre("Pop"); // valid
        System.out.println(mySong.getGenre());

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");    // extra method (only 1)

        System.out.println("Demonstrating toString()");
        System.out.println(mySong.toString()); // output toString
    }
}
