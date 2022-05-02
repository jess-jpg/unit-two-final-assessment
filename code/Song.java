/**
 * Creates a song with attributes
 *
 * Class: ICS4U1
 * Date: May 01 2022
 * @author James Wong
 */

public class Song {
    /* attribute */

    /** the name of the song */
    private String name;
    /** the artist of the song */
    private String artist;
    /** the album of the song */
    private String album;
    /** if the song is liked or not */
    private boolean isLiked;
    /** the genre of the song */
    private String genre;
    /** the length of the song */
    private int time;

    /* constructors */

    public Song(String name, String artist, String album, boolean isLiked, String genre, int time){
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.isLiked = isLiked;
        this.genre = genre;
        this.time = time;

        if (time < 0) {
            time = 0;
        }

    }

    /* accessors */

    /**
     Name: getName
     Description: return the song name
     @return the name of the song
     */
    public String getName() {return this.name;}

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
    public String getIsLiked() {return this.isLiked;}

    /**
     Name: getGenre
     Description: return the song genre
     @return the genre of the song
     */
    public String getGenre() {return this.genre;}

    /**
     Name: getTime
     Description: return the song time
     @return the time of the song
     */
    public int getTime() {return this.time;}

    /* mutators */

    /**
     * Name: setName
     * Description: set a name for the song
     * @param newName is the new song
     */
    public void setName(String newName) {
        // new name must be greater then 1 character
        if (newName.length()>0) {
            this.name = newName;
        }
    }

    /**
     * Name: setArtist
     * Description: set a artist for the song
     * @param newArtist is the new song
     */
    public void setArtist(String newArtist) {
        // new artist must be greater then 1 character
        if (newArtist.length()>0){
            this.artist = newArtist;
        }
    }

    /**
     * Name: setAlbum
     * Description: set a album for the song
     * @param newAlbum is the new song
     */
    public void setAlbum(String newAlbum) {
        // new album must be greater then 1 character
        if (newAlbum.length()>0){
            this.album = newAlbum;
        }
    }

    /**
     * Name: setGenre
     * Description: set a genre for the song
     * @param newgGenre is the new song
     */
    public void setGenre(String newGenre) {
        // new Genre must be greater then 1 character
        if (newGenre.length()>0){
            this.genre = newGenre;
        }
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

    /**
     Name: setTime
     Description: set the restrictions of the time of the song
     @param newTIme
     */
    public void setTime(boolean newTime) {
        if (newTime < 0){
            this.Time = 0;
        }
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
        attributes = "Name: " + this.name + "\nArtist: " + this.artist +  "\nAlbum: " + this.album + "\nLiked: " + this.isLiked + "\nGenre: " + this.genre + "\nTime: " + this.time;

        return attributes;
    }


    // testing every method
    public static void main(String[] args) {
        // constructor (importing a song)
        Song song = new Song("Lucid Dreams", "Juice WRLD", "Goodbye & Good Riddance", true, "Rap", 3.98);

        // accessors
        System.out.println("Accessors");
        System.out.println("Name: " + song.getName());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Album: " + song.getAlbum());
        System.out.println("Liked: " + song.getIsLiked());
        System.out.println("Time: " + song.getTime());
        System.out.println("Genre: " + song.getGenre());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // mutators
        System.out.println("Mutators");
        System.out.println();

        song.setName(""); // invalid too short (same error for artist, album, and genre)
        System.out.println(song.getName()); // note that name doesn't change
        song.setName("34+35");
        System.out.println(song.getName()); // name of song changes
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
        System.out.print();

        song.setTime(-100);
        System.out.println(song.getTime()); // time doesnt change
        song.setTime(2.9);
        System.out.println(song.getTime());
        System.out.println();

        // other methods

        System.out.println("Demonstrating toString()");
        System.out.println(account.toString());

    }
}
