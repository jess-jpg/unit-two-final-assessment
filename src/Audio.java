/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: user account settings
 * group project with James Wong and Michael Zhou
 * doc: https://docs.google.com/document/d/16QeONBDjzw7YelEpWf7fzxyFRauphnHRwBJ4ydkLy88/edit#
 *
 * this is the audio (pitch changes, filters, others)
 *
 * Course: ICS4U1
 * Date: May 02 2022
 * @author Jessica Lu
 */

public class Audio {
    /* attributes */
    /** if audio is nightcore'd */
    private boolean nightcore;
    /** if audio is slowed */
    private boolean slowed;
    /** if audio has added reverb */
    private boolean reverb;
    /** audio filter */
    private String audioFilter;
    /** time length of crossfade in seconds */
    private int crossfade;
    /** if mono audio is on (both left + right output is the same) */
    private boolean monoAudio;

    final private static int MAX_CROSSFADE = 12; // max crossfade length is 12 seconds

    /* constructors */

    public Audio(int crossfade, boolean monoAudio) {
        // crossfade is between 0 to 12 seconds
        if (crossfade >= 0 && crossfade <= MAX_CROSSFADE) {
            this.crossfade = crossfade;
        } else {
            this.crossfade = 0;
        }
        this.monoAudio = monoAudio;
        this.nightcore = false;
        this.slowed = false;
        this.reverb = false;
        this.audioFilter = "None";
    }

    /* accessors */

    /**
     * Name: getNightcore
     * Description: returns if audio is nightcore'd
     * @return if audio is nightcore'd
     */
    public boolean getNightcore() {
        return this.nightcore;
    }

    /**
     * Name: getSlowed
     * Description: returns if audio is slowed
     * @return if audio is slowed
     */
    public boolean getSlowed() {
        return this.slowed;
    }

    /**
     * Name: getReverb
     * Description: returns if audio has added reverb
     * @return if audio has added reverb
     */
    public boolean getReverb() {
        return this.reverb;
    }

    /**
     * Name: getAudioFilter
     * Description: returns the audio filter in use. if none is used, returns "none"
     * @return audio filter in use
     */
    public String getAudioFilter() {
        return this.audioFilter;
    }

    /**
     * Name: getCrossfade
     * Description: returns the audio crossfade in seconds
     * @return crossfade in seconds
     */
    public int getCrossfade() {
        return this.crossfade;
    }

    /**
     * Name: getMonoAudio
     * Description: returns if mono audio is on
     * @return if mono audio is on
     */
    public boolean getMonoAudio() {
        return this.monoAudio;
    }

    /* mutators */

    /**
     * Name: setNightcore
     * Description: sets nightcore on/off
     * @param nightcore new nightcore setting
     */
    public void setNightcore(boolean nightcore) {
        this.nightcore = nightcore;
    }

    /**
     * Name: setReverb
     * Description: sets reverb on/off
     * @param reverb new reverb setting
     */
    public void setReverb(boolean reverb) {
        this.reverb = reverb;
    }

    /**
     * Name: setSLowed
     * Description: sets slowed on/off
     * @param slowed new slowed setting
     */
    public void setSlowed(boolean slowed) {
        this.slowed = slowed;
    }

    /**
     * Name: setAudioFilter
     * Description: sets a new audio filter
     * @param audioFilter new audio filter setting
     */
    public void setAudioFilter(String audioFilter) {
        // filters: none, acoustic, classical, electronic, jazz, rock, pop
        if (audioFilter.equalsIgnoreCase("None") || audioFilter.equalsIgnoreCase("Acoustic") || audioFilter.equalsIgnoreCase("Classical") || audioFilter.equalsIgnoreCase("Electronic") || audioFilter.equalsIgnoreCase("Jazz") || audioFilter.equalsIgnoreCase("Rock") || audioFilter.equalsIgnoreCase("Pop")) {
            this.audioFilter = audioFilter;
        } else {
            this.audioFilter = "None";
        }
    }

    /**
     * Name: setCrossfade
     * Description: sets new crossfade time
     * @param crossfade new crossfade time in seconds
     */
    public void setCrossfade(int crossfade) {
        if (crossfade < 0) { // if input crossfade is less than 0, crossfade = 0;
            this.crossfade = 0;
        } else if (crossfade > MAX_CROSSFADE) { // if input crossfade is more than 12, crossfade = 12
            this.crossfade = MAX_CROSSFADE;
        } else { // input crossfade is in range of 0 - MAX_CROSSFADE
            this.crossfade = crossfade;
        }
    }

    /**
     * Name: setMonoAudio
     * Description: sets monoAudio on/off
     * @param monoAudio new monoAudio setting
     */
    public void setMonoAudio(boolean monoAudio) {
        this.monoAudio = monoAudio;
    }

    /* other methods */

    /**
     * Name: whatIsOn
     * Description: outputs what is currently on (what is true), the crossfade time, and the audio filter in use
     */
    public void whatIsOn() {
        // audio pitch changes
        System.out.println("Audio Settings That Are On: ");
        if (this.nightcore) {
            System.out.println("- nightcore");
        }
        if (this.reverb) {
            System.out.println("- reverb");
        }
        if (this.slowed) {
            System.out.println("- slowed");
        }
        // output filters + crossfade
        System.out.println("Audio Filter: " + this.audioFilter);
        System.out.println("Crossfade: " + this.crossfade + " seconds");

        // output if mono audio is on/off
        System.out.print("Mono Audio: ");
        if (this.monoAudio) {
            System.out.println("on");
        } else {
            System.out.println("off");
        }
    }

    /**
     * Name: toString
     * Description: returns all audio attributes
     * @return string of all attributes
     */
    public String toString() {
        String line;
        line = "Nightcore: " + this.nightcore + "\nReverb: " + this.crossfade + "\nSlowed: " + this.slowed + "\nAudio Filter: " + this.audioFilter + "\nCrossfade: " + this.crossfade + " seconds\nMono Audio: " + this.monoAudio;
        return line;
    }

    // ADD MAIN METHOD!!!!
    public static void main(String[] args) {
        // constructor
        Audio audio = new Audio(3, false); // creates new audio settings with crossfade time of 3 seconds, mono audio false. defaults: no pitch changes, no audio filter

        // accessors
        System.out.println("ACCESSORS");
        System.out.println("Nightcore on: " + audio.getNightcore());
        System.out.println("Reverb on: " + audio.getReverb());
        System.out.println("Slowed on: " + audio.getSlowed());
        System.out.println("Audio filter: " + audio.getAudioFilter());
        System.out.println("Crossfade: " + audio.getCrossfade() + " seconds");
        System.out.println("Mono audio on: "+ audio.getMonoAudio());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // mutators
        System.out.println("MUTATORS");
        System.out.println();

        System.out.println("Turning nightcore, slowed, and reverb settings ON");
        audio.setNightcore(true);
        audio.setReverb(true);
        audio.setSlowed(true);
        System.out.println("Nightcore on: " + audio.getNightcore());
        System.out.println("Reverb on: " + audio.getReverb());
        System.out.println("Slowed on: " + audio.getSlowed());

        System.out.println();

        System.out.println("Setting new audio filter:");
        audio.setAudioFilter("Acoustic"); // valid bc acoustic is one of the filters so it changes the filter to that
        System.out.println(audio.getAudioFilter());
        audio.setAudioFilter("wooooo!!"); // invalid bc this is not a filter name, so audio filter defaults to none
        System.out.println(audio.getAudioFilter());

        System.out.println();

        System.out.println("Setting new crossfade time:");
        audio.setCrossfade(200); // invalid bc 200 is not in the range 0 to 12 (where 12 is the max time in sec), so crossfade = max = 12
        System.out.println(audio.getCrossfade());
        audio.setCrossfade(-30); // invalid bc -30 is not in the range 0 to 12 (where 12 is the max time in sec), so crossfade = min = 0
        System.out.println(audio.getCrossfade());
        audio.setCrossfade(8); // valid bc 8 is in the range 0-12 so new crossfade time = 8
        System.out.println(audio.getCrossfade());

        System.out.println();

        System.out.println("Change mono audio setting:");
        audio.setMonoAudio(true);
        System.out.println("Mono audio on: " + audio.getMonoAudio());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // other methods

        System.out.println("OTHER METHODS");
        System.out.println();

        System.out.println("Demonstrating whatIsOn()");
        audio.whatIsOn();

        System.out.println();

        System.out.println("Demonstrating toString()");
        System.out.println(audio.toString());


    }


}
