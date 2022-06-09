/**
 * Creates an album with attributes
 *
 * Class: ICS4U1
 * Date: May 01 2022
 * @author James Wong
 */
import java.util.*;

public class Album extends Playable {

    /* attribute */

    /** the artist of the album */
    private String artist;

    /** the release date of the album */
    private String releaseDate;

    /* constructors */

    /**
     Name: Album
     Description: creates an album
     @param title title of the song
     @param artist artist of the song
     @param totalTime total time of the song
     */
    public Album(String title, int totalTime, String artist, String releaseDate) {
        super(title, totalTime);
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    /* accessors */

    /**
     Name: getArtist
     Desciption: return the artist of the album
     @return the artist of the album
     */
    public String getArtist() {return this.artist;}

    /**
     Name: getReleaseDate
     Description: return release date of the album
     @return the release date of the album
     */
    public String getReleaseDate() {return this.releaseDate;}

    /* mutators */

    /**
     * Name: setArtist
     * Description: set an artist for the album
     * @param newArtist of the album
     */
    public void setArtist(String newArtist) {
        // new artist must be greater than 1 character
        if (newArtist.length()>0) {
            this.artist = newArtist;
        }
    }

    /**
     * Name: setReleaseDate
     * Description: set a release date of the album
     * @param newReleaseDate of the album
     */
    public void setReleaseDate(String newReleaseDate) {
        // sort by year (xoxx)
        this.releaseDate = newReleaseDate;
    }

    /* other methods */

    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes
     */
    public String toString() {
        String attributes;

        System.out.println(super.toString());
        attributes = "Artist: " + this.artist +  "\nRelease Date: " + this.releaseDate ;

        return attributes;
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {

        // constructor
        // String title, int totalTime, String artist, String releaseDate
        Album myAlbum = new Album("X (Deluxe Version)", 3900, "Ed Sheeran", "2014");

        // accessors
        System.out.println();
        System.out.println("ACCESSORS");

        System.out.println("Artist: " + myAlbum.getArtist());
        System.out.println("Release Date: " + myAlbum.getReleaseDate());

        // mutators
        System.out.println();
        System.out.println("MUTATORS");

        System.out.println("catching if the artist is less then 1 character");
        myAlbum.setArtist("");  // invalid
        System.out.println(myAlbum.getArtist());
        myAlbum.setArtist("Taylor Swift");
        System.out.println(myAlbum.getArtist());

        System.out.println("Setting the release date of the album");
        myAlbum.setReleaseDate("2022");

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");

        System.out.println("Demonstrating toString()");
        System.out.println(myAlbum.toString()); // output toString
    }
}
