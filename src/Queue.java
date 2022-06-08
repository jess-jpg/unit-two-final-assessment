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
    /** declare array which will be used as the queue */
    private String queue[][] = new String [numSong][2];

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

    /**
     Name: getQueue
     Description: return the queue
     @return the queue
     */
    public String[][] getQueue() {return this.queue;}

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

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<numSong; i++) {
            queue[i][0] = String.valueOf(i+1);
            System.out.println(queue[i][0]);            /** delete later, mainly to test */

            // input the titles of all the songs
            System.out.println("Title: ");
            String title = sc.nextLine();
            queue[i][1] = title;

            // input the artists of all the songs
            System.out.println("Artist: ");
            String artist = sc.nextLine();
            queue[i][2] = artist;
        }
    }

    /**
     Name: shuffle
     Description: shuffles all songs in the queue
     */
    public void shuffle() {

        int largestNum = Integer.parseInt(queue[numSong-1][0]);

        int hold[] = new int[numSong];

        for (int j = 0; j<numSong; j++) {
            int random = (int) (Math.random() * largestNum);

            for (int k = 0; k<numSong; k++) {
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
        Queue myQueue = new Queue(3);

        // accessors
        System.out.println();
        System.out.println("ACCESSORS");

        System.out.println("Number of Songs: " + myQueue.getNumSong());
        System.out.println("Queue: " + Arrays.deepToString(myQueue.getQueue()));

        // mutators
        System.out.println();
        System.out.println("MUTATORS");

        System.out.println("catching if the number of songs is a negative");
        myQueue.setNumSong(-2);  // invalid

        System.out.print("only works when the number of songs is a positive");
        myQueue.setNumSong(9);  // valid

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");

        


    }
}
