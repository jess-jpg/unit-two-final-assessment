/**
 * Creates an album with attributes
 *
 * Class: ICS4U1
 * Date: May 01 2022
 * @author James Wong
 */
import java.util.*;

public class Album {

    /* attribute */

    /** the title of the album */
    private String title;

    /** the artist of the album */
    private String artist;

    /** the release date of the album */
    private String releaseDate;

    /** is the album liked */
    private boolean isLiked;

    /* constructors */

    public Album(String title, String artist, String releaseDate, boolean isLiked) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.isLiked = isLiked;
    }

    /* accessers */

    /**
     Name: getTitle
     Description: return the title of the album
     @return the title of the album
     */
    public String getTitle() {return this.title;}

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
    public String getReleaseDate() {return this.releaseDate}

    /**
     Name: getIsLiked
     Description: return whether the song is liked or not
     @return whether the song is liked or not
     */
    public String getIsLiked() {return this.isLiked;}

    /* mutators */

    /**
     * Name: setTitle
     * Description: set a title for the album
     * @param newTitle of the album
     */
    public void setTitle(String newTitle) {
        // new title must be greater then 1 character
        if (newTitle.length()>0) {
            this.title = newTitle;
        }
    }

    /**
     * Name: setArtist
     * Description: set an artist for the album
     * @param newTitle of the album
     */
    public void setArtist(String newArtist) {
        // new artist must be greater then 1 character
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
        this.releaseDate = newReleaseDate
    }

    /**
     Name: setIsLiked
     Description: set if a song is liked or not
     @param newIsLiked
     */
    public void setIsLiked(boolean newIsLiked) {
        if (newIsLiked) {
            this.isLiked = true;
        } else {
            this.isLiked = false;
        }
    }

    /* other methods */

    /**
     Name: storeSong
     Description: stores song information
     @return store songs on a txt file
     */
    public void storeSong() {
        String fileIn = "songlist.txt"; // import file to code

        String song = this.title + "\n" + this.artist + "\n" + this.releaseDate + "\n" + this.isLiked;

        try{
            BufferedWriter wr = new BufferedWriter ()
            wr.write(fileIn);

        } catch (IOE exception) {
            e.printStackTrace();
        }



    }

    /**
     Name: takeSong
     Description: takess song information
     @return take songs from a txt file

    public void takeSong() {
        String fileIn = "songlist.txt"; // import file to code

        BufferedReader br = new BufferedReader(new FileReader(fileIn));


    }
     */


    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes
     */
    public String toString() {
        String attributes;

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isTired, boolean isColdBlooded
        attributes = "Title: " + this.title + "\nArtist: " + this.artist +  "\nRelease Date: " + this.releaseDate + "\nLiked: " + this.isLiked;

        return attributes;
    }

    System.out.println(album.storeSong);

}
