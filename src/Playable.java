/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: user account settings
 * group project with James Wong and Michael Zhou
 * doc: https://docs.google.com/document/d/16QeONBDjzw7YelEpWf7fzxyFRauphnHRwBJ4ydkLy88/edit#
 *
 * this is the Playable superclass. Album, Song, Playlist, Podcast, Episode are subclasses
 * it has functionality to play/pause/loop the playable
 *
 * Course: ICS4U1
 * Date: May 02 2022
 * @author Jessica Lu
 */

public class Playable {
    /* attributes */

    /**
     * title of playable
     */
    private String title;
    /**
     * total time of playable in seconds
     */
    private int totalTime;
    /**
     * what time the listener is at of playable
     */
    private int timeAt;
    /**
     * whether the playable is liked or not
     */
    private boolean isLiked;
    /**
     * whether loop is or not
     */
    private boolean loopOn;

    /* constructors */

    /**
     * Name: Playable
     * Description: constructs a playable object
     *
     * @param title     title of playable
     * @param totalTime total time of playable in seconds
     */
    public Playable(String title, int totalTime) {
        // for the subclasses under Playable, title and totalTime would be read in from a text file. however for Playable, it is read in from a parameter because a Playable object will not actually be created
        this.title = title;

        // total time cannot be negative
        if (totalTime < 0) {
            this.totalTime = 0;
        } else {
            this.totalTime = totalTime;
        }

        // defaults
        this.timeAt = 0;
        this.isLiked = false;
        this.loopOn = false;
    }

    /* accessors */

    /**
     * Name: getTitle
     * Description: return the playable title
     *
     * @return title of the playable
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Name: getTotalTime
     * Description: return the playable total time in seconds
     *
     * @return total time of the playable in seconds
     */
    public int getTotalTime() {
        return this.totalTime;
    }

    /**
     * Name: getTimeAt
     * Description: return the time the listener is at of the playable
     *
     * @return time the listener is at of the playable
     */
    public int getTimeAt() {
        return this.timeAt;
    }

    /**
     * Name: getIsLiked
     * Description: return whether the playable is liked or not
     *
     * @return the listener is at of the playable
     */
    public boolean getIsLiked() {
        return this.isLiked;
    }

    /**
     * Name: getLoopOn
     * Description: return whether loop is on or not
     *
     * @return time the listener is at of the playable
     */
    public boolean getLoopOn() {
        return this.loopOn;
    }

    /* mutators */

    /**
     * Name: setIsLiked
     * Description: set if the playable is liked or not
     */
    public void setIsLiked(boolean isLiked) {
        this.isLiked = isLiked;
    }

    /* other methods */

    /**
     * Name: playPause
     * Description: plays the song / episode for a given amount of seconds. if the time you would be if you play is over, it depends on loop if it plays again
     * if loop is on, it restarts the playable. if loop is off, it stops at the end.
     *
     * @param seconds how much time you play
     */
    public void playPause(int seconds) {
        int timeWouldBeAt; // the time it would be at if you add the new time to it
        timeWouldBeAt = this.timeAt + seconds;

        if (seconds <= 0) {
            // nothing happens. must have seconds > 0
        } else if (timeWouldBeAt <= this.totalTime) { // if the time you would be at if you played the given time is <= total time
            this.timeAt = this.timeAt + seconds; // adds to the time
        } else if (this.loopOn) { // if loop is on
            this.timeAt = timeWouldBeAt - this.totalTime; // goes back to that time
        } else { // if loop is off, then timeAt is at the end, is = total time
            this.timeAt = this.totalTime;
        }
    }

    /**
     * Name: skipToTime
     * Description: skip to a given time in seconds of the playable (goes forwards or back)
     *
     * @param time the time you want to skip to in seconds
     */
    public void skipToTime(int time) {
        // time that the listener wants to skip to must be less than or equal to the total time of the playable
        if (time <= this.totalTime) {
            this.timeAt = time;
        }
    }

    /**
     * Name: loop
     * Description: turn on loop
     */
    public void loop() {
        this.loopOn = true;
    }

    /**
     * Name: unLoop
     * Description: turn off loop
     */
    public void unLoop() {
        this.loopOn = false;
    }

    /**
     * Name: toString
     * Description: returns string of all attribute values
     *
     * @return all attribute values
     */
    public String toString() {
        String line;
        line = "Title: " + this.title + "\nTotal Time: " + this.totalTime + " seconds\nCurrently at: " + this.timeAt + " seconds\nIs liked: " + this.isLiked + "\nLoop on: " + this.loopOn;
        return line; // return the entire string
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {
        // constructor
        Playable myPlayable = new Playable("Just Give Me A Reason", 242); // creating a playable named "Just Give Me A Reason"

        // accessors
        System.out.println("ACCESSORS"); // accessor for each attribute (5 total)
        System.out.println();

        System.out.println("Title: " + myPlayable.getTitle());
        System.out.println("Total Time: " + myPlayable.getTotalTime() + " seconds");
        System.out.println("Time at: " + myPlayable.getTimeAt() + " seconds");
        System.out.println("Is liked: " + myPlayable.getIsLiked());
        System.out.println("Loop on: " + myPlayable.getLoopOn());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // mutators
        System.out.println("MUTATORS"); // mutator for 1 attribute: isLiked attribute
        System.out.println();

        System.out.println("Liking the playable");
        myPlayable.setIsLiked(true);
        System.out.println(myPlayable.getIsLiked());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // other methods
        System.out.println("OTHER METHODS");
        System.out.println();

        System.out.println("Demonstrating playPause()");
        myPlayable.playPause(-1); // invalid: play -1 seconds. cannot, bc it cannot go backwards
        System.out.println(myPlayable.getTimeAt()); // outputs the new time (stays the same, 0 sec)
        myPlayable.playPause(30); // play 30 seconds
        System.out.println(myPlayable.getTimeAt()); // outputs the new time (30 secs)
        myPlayable.playPause(1000); // tries to play 10000 seconds
        System.out.println(myPlayable.getTimeAt()); // outputs the new time (242 secs which is the total. if you give an output that would give over the max, timeAt = max time)
        System.out.println();

        System.out.println("Demonstrating skipToTime()");
        myPlayable.skipToTime(0); // can set time back to 0
        System.out.println(myPlayable.getTimeAt());
        myPlayable.skipToTime(1000); // invalid: 1000 is over the 242 seconds max time (so time = still 0)
        System.out.println(myPlayable.getTimeAt());
        System.out.println();

        System.out.println("Demonstrating loop()");
        myPlayable.loop(); // turn loop on
        System.out.println(myPlayable.getLoopOn()); // output if loop is on (true)
        System.out.println();

        System.out.println("Demonstrating unLoop()");
        myPlayable.unLoop(); // turn loop off
        System.out.println(myPlayable.getLoopOn()); // output if loop is on (false)
        System.out.println();

        System.out.println("Demonstrating toString()");
        System.out.println(myPlayable.toString()); // output toString
    }
}