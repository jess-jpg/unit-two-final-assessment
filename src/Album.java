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

    /** is the album liked */
    private boolean isLiked;

    /* constructors */

    /**
     Name: Album
     Description: creates an album
     @param title title of the song
     @param artist artist of the song
     @param totalTime total time of the song
     @param timeAt
     @param isLiked if the song is liked or not
     @param loopOn if the song is on loop
     */
    public Album(String title, int totalTime, int timeAt, boolean loopOn, boolean isLiked, String artist, String releaseDate) {
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
        // sort by month day year, for example mm/dd/yyyy
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

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isTired, boolean isColdBlooded
        System.out.println(super.toString());
        attributes = "Artist: " + this.artist +  "\nRelease Date: " + this.releaseDate ;

        return attributes;
    }

}
