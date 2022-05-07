public class Playable {
    /* attributes */
    private String title;
    private int totalTime;
    private int timeAt;
    private boolean isLiked;
    private boolean loopOn;

    /* constructors */
    public Playable(String textFileName) {


        /*
        this.title = title;
        this.totalTime = totalTime;
        */

        this.timeAt = 0;
        this.isLiked = false;
        this.loopOn = false;
    }

    /* accessors */

    public String getTitle() {
        return this.title;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public int getTimeAt() {
        return this.timeAt;
    }

    public boolean getIsLiked() {
        return this.isLiked;
    }

    public boolean getLoopOp() {
        return this.loopOn;
    }

    /* mutators */

    public void setIsLiked(boolean isLiked) {
        this.isLiked = isLiked;
    }

    /* other methods */

    /**
     * Name: playPause
     * Description: plays the song / episode for a given amount of seconds. if the time you would be if you play is over, it depends on loop if it plays again
     * if loop is on, it restarts the playable. if loop is off, it stops at the end.
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
     * Description: skip to a given time in seconds of the playable
     * @param time the time you want to skip to
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

    /** TO FINISH, NOT DONE */
    public void skip() {
        // skip to next thing (song/episode)
    }

    /** TO FINISH, NOT DONE */
    public void reverse() {
        // go back one thing (song/episode)
    }

    /**
     * Name: toString
     * Description: returns string of all attribute values
     * @return all attribute values
     */
    public String toString() {
        String line;
        line = "Title: " + this.title + "\nTotal Time: " + this.totalTime + " seconds\nCurrently at: " + this.timeAt +  " seconds\nIs liked: " + this.isLiked + "\nLoop on: " + this.loopOn;

        return line; // still needs to test
    }

    /*

    playPause(int seconds)
seconds of how much you play
must enter a value less than or equal to

skipToTime(int time)
time you want to skip to of the playable in seconds

skip()
skips to next song in array
if there is nothing else, the song stays as it is
(or episode)

reverse()
goes back a song in the array
if there is nothing, the song stays as it is
(or episode)

    */
    
}
