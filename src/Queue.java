/**
 * Creates a queue with attributes
 *
 * Class: ICS4U1
 * Date: May 03 2022
 * @author James Wong
 */
import java.util.*;

public class Queue extends Playable {

    /* attribute */

    /** the artist of the song */
    private String artist;
    /** the album of the song */
    private String album;
    /** the genre of the song */
    private String genre;

    /* constructor */

    /**
     Name: Queue
     Description: creates a song
     @param title title of the song
     @param artist artist of the song
     @param album album of the song
     @param genre genre of the song
     @param totalTime total time of the song
     @param timeAt
     @param isLiked if the song is liked or not
     @param loopOn if the song is on loop
     */
    public Queue(String title, int totalTime, int timeAt, boolean isLiked, boolean loopOn, String artist, String album, String genre){

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
    public void artist(String newArtist){
        if (newArtist.length()>0) {
            this.artist = newArtist;
        }
    }

    /**
     * Name: album
     * Description: set the album name
     * @param  newAlbum new possible artist
     */
    public void album(String newAlbum) {
        if (newAlbum.length()>0) {
            this.album = newAlbum;
        }
    }

    /**
     * Name: genre
     * Description: set the artist name
     * @param  newGenre new possible artist
     */
    public void genre(String newGenre){
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

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isTired, boolean isColdBlooded
        System.out.println(super.toString());
        attributes = "Artist: " + this.artist +  "\nAlbum: " + this.album + "\nGenre: " + this.genre;

        return attributes;
    }

}
