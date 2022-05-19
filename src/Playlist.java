import java.util.*;

public class Playlist extends Playable {

    // attributes
    // inherits attributes from Playable class (title, totalTime, timeAt, isLiked, loopOn)

    /** the playlist */
    private ArrayList<Song> playlist;
    /** current song */
    private String currentSong;
    /** playlist description */ // must be between 0 and 150 characters
    private String description;
    /** whether playlist is public or not */
    private boolean isPublic;
    /** number of songs in the playlist */
    private int numOfSongs;

    // constructors
    /**
     * Name: Playlist
     * Description: constructs an empty playlist with a title
     * @param title title of playlist
     */
    public Playlist(String title) {
        super(title, 0); /// from Playable. title = title, totalTime = 0 because there are no songs

        // title of playlist must be equal to or less than 50 characters
        if (title.length() > 50) {
            // setTitle = "woo"; // how to change the title?>???
        }

        // defaults
        this.currentSong = "";
        this.description = ""; // starts with no description
        this.numOfSongs = 0; // starts with no songs
        this.isPublic = false; // is default private
    }

    // accessors

    /**
     * Name: getPlaylist
     * Description: returns playlist
     * @return playlist
     */
    public ArrayList<Song> getPlaylist() {
        return this.playlist;
    }

    /**
     * Name: getCurrentSong
     * Description: returns the current song. if no song, returns empty string
     * @return current song
     */
    public String getCurrentSong() {
        return this.currentSong;
    }

    /**
     * Name: getDescription
     * Description: returns playlist description
     * @return playlist description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Name: getIsPublic
     * Description: returns if the playlist is public
     * @return true/false if the playlist is public
     */
    public boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * Name getNumOfSongs
     * Description: returns number of songs in the playlist
     * @return number of songs in playlist
     */
    public int getNumOfSongs() {
        return this.numOfSongs;
    }

    // mutators

    /**
     *
     * setTitle: how to change title if it is from superclass??
     *
     * */

    /**
     * Name: setDescription
     * Description: sets new playlist description. must be equal to or less than 100 chars long
     * @param description new description input
     */
    public void setDescription(String description) {
        // if the given description is less than or 100 chars long, it changes to that. if not, it stays the same
        if (description.length() >= 100) {
            this.description = description;
        }
    }

    /**
     * Name: setIsPublic
     * Description: sets if the playlist is public or private
     * @param isPublic new public setting
     */
    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    // other methods

    /**
     * Name: addSong
     * Description: adds a song to the playlist
     * @param song song added to playlist
     */
    public void addSong(Song song) {
        this.playlist.add(song); // adds song
        // add song time to the total time
        this.numOfSongs++; // num of songs goes up by 1
    }

    /**
     * Name: removeSong
     * Description: removes a song to the playlist
     * @param song song removed from playlist
     */
    public void removeSong(Song song) {
        this.playlist.remove(song); // removes this song
        // subtract song time to the total time
        this.numOfSongs--; // num of songs goes down by 1
    }




    // delete


    // testing methods. nOT DONE
    public static void main(String[]args) {

        Playlist playlist = new Playlist("name");

        Song song1 = new Song("The Other Side Of Paradise", 320, "Glass Animals", "How To Be A Human Being", "Alternative/Indie");

        playlist.addSong(song1);

    }
}
