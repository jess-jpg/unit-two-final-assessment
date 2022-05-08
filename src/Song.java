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
    /** if the song is liked or not */
    private boolean isLiked;
    /** the genre of the song */
    private String genre;

    /* constructors */

    /**
     Name: Dog
     Description: creates a song
     @param title title of the song
     @param artist artist of the song
     @param album album of the song
     @param genre genre of the song
     @param totalTime total time of the song
     @param
     */
    public Song(String title, int totalTime, int timeAt, boolean isLiked, boolean loopOn, String artist, String album, String genre){

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
     Name: getIsLiked
     Description: return whether the song is liked or not
     @return whether the song is liked or not
     */
    public boolean getIsLiked() {return this.isLiked;}

    /**
     Name: getGenre
     Description: return the song genre
     @return the genre of the song
     */
    public String getGenre() {return this.genre;}

    /* mutators */

    /* other methods */

    /**
     Name: readInSong
     Description: reads in the song to play
     */
    public void readInString() {

    }

    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public String toString() {
        String attributes;

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isTired, boolean isColdBlooded
        System.out.println(super.toString());
        attributes = "Artist: " + this.artist +  "\nAlbum: " + this.album + "\nLiked: " + this.isLiked + "\nGenre: " + this.genre;

        return attributes;
    }


    // testing every method
    public static void main(String[] args) {

        // other methods

        System.out.println("Demonstrating toString()");
        System.out.println(song.toString());

    }
}
