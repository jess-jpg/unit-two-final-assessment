/**
 * Creates a queue with attributes
 *
 * Class: ICS4U1
 * Date: May 03 2022
 * @author James Wong
 */
import java.util.*;

public class Queue{

    /* attribute */

    /** the number of songs in queue */
    private int numSong;
    private ArrayList<Song> queue;

    /* constructor */

    /**
     Name: Queue
     Description: creates a song
     */
    public Queue(){
        this.numSong = 0;
        this.queue = new ArrayList<>();
    }

    /* accessors */

    /**
     Name: getNumSong
     Description: return the number of songs
     @return the number of songs in the queue
     */
    public int getNumSong() {return this.numSong;}


    /* other methods */

    /**
     Name: addQueue
     Description: adds a song to the songs that will be played (the queue)
     @param song song added to the queue
     */
    public void addQueue(Song song) {
        this.queue.add(song);

        // add song to the list
        this.numSong++;
    }

    /**
     Name: removeQueue
     Description: remove a song to the songs that will be played (the queue)
     @param song song removed from queue
     */
    public void removeQueue(Song song) {
        this.queue.remove(song);

        // remove song from the list
        this.numSong--;
    }

    /**
    Name: shuffle
    Description: shuffles all songs in the queue
     */
    public void shuffle() {
        if (queue != null) { // if queue is NOT empty
            Collections.shuffle(queue);
        }
    }

    /**
     Name: displayQueueToString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public String displayQueueToString() {
        String attributes;

        attributes = "Queue List : " + queue;

        return attributes;
    }

    // TESTING METHOD
    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {
        // constructor
        Queue myQueue = new Queue();

        // accessors
        System.out.println();
        System.out.println("ACCESSORS");
        System.out.println("Number of Songs: " + myQueue.getNumSong());

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");

        Song song1 = new Song("Paradise", 420, "Coldplay", "Mylo Xyloto", "Alternative Indie");
        Song song2 = new Song("HOLO", 259, "LeeHi", "HOLO", "K-Pop");
        Song song3 = new Song("EARTHQUAKE", 308, "Tyler, The Creator", "IGOR", "Hip-Hop");
        Song song4 = new Song("Off the grid", 320, "Alina Baraz", "It Was Divine", "R&B/Soul");
        Song song5 = new Song("Snow On Tha Bluff", 354, "J. Cole", "Snow On Tha Bluff", "Rap");

        System.out.println();
        System.out.println("Demonstrating add queue function");
        myQueue.addQueue(song1);
        myQueue.addQueue(song2);
        myQueue.addQueue(song3);
        myQueue.addQueue(song4);
        myQueue.addQueue(song5);
        System.out.println("Number of Songs: " + myQueue.getNumSong());

        System.out.println();
        System.out.println("Demonstrating remove queue function");
        myQueue.removeQueue(song1);
        System.out.println("Number of Songs: " + myQueue.getNumSong());

        System.out.println();
        System.out.println("Demonstrating shuffle function and dusplaying queue to string");
        System.out.println();
        System.out.println("UNSHUFFLED");
        myQueue.displayQueueToString();
        myQueue.shuffle();
        System.out.println();
        System.out.println("SHUFFLED");
        myQueue.displayQueueToString();
    }
}
