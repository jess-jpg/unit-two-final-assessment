/**
 * Creates a queue with attributes
 *
 * Class: ICS4U1
 * Date: May 03 2022
 * @author James Wong
 */
import java.util.*;

public class Queue {

    /* attribute */

    /** the number of songs in queue */
    private int numSong;
    private String queue[][] = new String[numSong][3];     /** THIS PART (please mr lee i need help)*/

    /* constructor */

    /**
     Name: Queue
     Description: creates a song
     @param numSong number of songs

     */
    public Queue(int numSong){

        this.numSong = numSong;
    }

    /* accessors */

    /**
     Name: getNumSong
     Description: return the number of songs
     @return the number of songs in the queue
     */
    public int getNumSong() {return this.numSong;}


    /* mutators */

    /**
     * Name: numSong
     * Description: set the number of songs in the queue
     * @param  newNumSong new number of songs in queue
     */
    public void setNumSong(int newNumSong){
        if (newNumSong>0) {
            this.numSong = newNumSong;
        }
    }


    /* other methods */

    /**
     Name: addQueue
     Description: adds a song to the songs that will be played (the queue)
     */
    public void addQueue() {
        String queue[][] = new String[numSong][3];      // declare an array as the queue
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<this.numSong; i++) {
            queue[i][0] = String.valueOf(i+1);

            // input the titles of all the songs
            System.out.print("Title: ");
            String title = sc.nextLine();
            queue[i][1] = title;

            // input the artists of all the songs
            System.out.print("Artist: ");
            String artist = sc.nextLine();
            queue[i][2] = artist;
        }
    }

    /**
     Name: shuffle
     Description: shuffles all songs in the queue
     */
    public void shuffle() {
        String queue[][] = new String[numSong][3];      // declare an array as the queue

        int largestNum = Integer.parseInt(queue[this.numSong-1][0]);

        int hold[] = new int[this.numSong];

        for (int j = 0; j<this.numSong; j++) {
            int random = (int) (Math.random() * largestNum);

            for (int k = 0; k<this.numSong; k++) {
                if (random == hold[k]) {
                    random = (int) (Math.random() * largestNum);
                } else {
                    hold[k] = random;
                }
            }
            queue[j][0] = String.valueOf(random);
        }
    }

    /**
     Name: displayQueueToString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public void displayQueueToString() {
        String queue[][] = new String[numSong][3];      // declare an array as the queue
        for (int l = 0; l<numSong; l++) {
            for (int h = 0; h<numSong; h++) {
                System.out.println(queue[l][h]);
            }
        }
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {
        // constructor
        // String title, int totalTime, String artist, String releaseDate
        Queue myQueue = new Queue(9);

        // accessors
        System.out.println();
        System.out.println("ACCESSORS");

        System.out.println("Number of Songs: " + myQueue.getNumSong());

        // mutators
        System.out.println();
        System.out.println("MUTATORS");

        System.out.println("catching if the number of songs is a negative");
        myQueue.setNumSong(-2);  // invalid
        System.out.println(myQueue.getNumSong());

        System.out.println("only works when the number of songs is a positive");
        myQueue.setNumSong(3);  // valid
        System.out.println(myQueue.getNumSong());

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");

        System.out.println("Demonstrating add queue function");
        myQueue.addQueue();

        System.out.println("Demonstrating shuffle function");
        myQueue.shuffle();

        System.out.println("displaying queue to string");
        myQueue.displayQueueToString();
    }
}
