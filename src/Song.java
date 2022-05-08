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
     Name: checkQueue
     Description: returns the songs in queue
     */


    /**
     Name: playQueue
     Description: returns all time attributes

    public void playQueue() {
        Scanner sc = new Scanner(System.in);

        while () {

        }

        System.out.println("Pause/Play, Skip, Reverse");
        String input = sc.nextLine();

    }
     */

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
        // constructor (importing a song)
        Song song = new Song("Lucid Dreams", "Juice WRLD", "Goodbye & Good Riddance", true, "Rap", 238.8);

        // accessors
        System.out.println("Accessors");
        System.out.println("Name: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Album: " + song.getAlbum());
        System.out.println("Liked: " + song.getIsLiked());
        System.out.println("Time: " + song.gettotalTime());
        System.out.println("Genre: " + song.getGenre());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // mutators
        System.out.println("Mutators");
        System.out.println();

        song.setTitle(""); // invalid too short (same error for artist, album, and genre)
        System.out.println(song.getTitle()); // note that name doesn't change
        song.setName("34+35");
        System.out.println(song.getTitle()); // name of song changes
        System.out.println();

        song.setArtist("Ariana Grande"); // valid
        System.out.println(song.getArtist()); // artist of song changes
        System.out.println();

        song.setAlbum(""); // invalid too short (same error for artist, album, and genre)
        System.out.println(song.getAlbum()); // note that album doesn't change
        song.setAlbum("Positions");
        System.out.println(song.getAlbum()); // album of song changes
        System.out.println();

        song.setGenre("Hip hop"); // valid
        System.out.println(song.getGenre()); // genre of song changes
        System.out.println();

        song.setIsLiked(false); // change liked song to unliked
        System.out.println(song.getIsLiked()); // liked song changes to unliked
        System.out.println();

        song.setTime(-100);
        System.out.println(song.getTime()); // time doesn't change
        song.setTime(174);
        System.out.println(song.getTime());
        System.out.println();

        // other methods

        System.out.println("Demonstrating toString()");
        System.out.println(song.toString());

    }
}
