
/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: podcast
 * group project with James Wong and Jessica Lu
 *
 * The class is where all the episodes are stored, while also
 * having itself attributes that provides use to the users
 *
 * Course: ICS4U1
 * Date: May 2, 2022
 * @author Michael Zhou
 */

import java.util.*;

public class Podcast {

    /*
    Attributes
    */

    /* the name of the podcast */
    private String name;

    /* whether the podcast is followed */
    private boolean isFollowed;

    /* the rating of the podcast */
    private double rating;      //cannot be controlled in the main

    /* the amount of times the podcast is rated */
    private int amountRated;      //cannot be controlled in the main

    /* whether the notification is turned on  */
    private boolean isNotification;

    /* the episodes in the podcast */
    private ArrayList<String> episodeList = new ArrayList<>();

    /*
    Constructor
    */

    /**
     * Name: Podcast
     * Description: Creates a new podcast, with aspects for the user such as the name, whether its followed and whether the notification
     * is turned on or not
     * @param name name of the podcast
     * @param isFollowed whether the podcast is followed
     * @param isNotification whether notifications is turned on
     */
    public Podcast(String name, boolean isFollowed, boolean isNotification) {

        //variables
        this.name = name;
        this.isFollowed = isFollowed;
        this.isNotification = isNotification;

        //variables that cannot be changed manually
        this.amountRated = 0;
        this.rating = 0;
    }

    /*
    Accessors
    */

    /**
     * Gets the name of the podcast
     * @return the name of the podcast
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets whether the podcast is followed
     * @return the follower status of the podcast
     */
    public boolean getIsFollowed()   {
        return this.isFollowed;
    }

    /**
     * Gets whether the podcast's notification is turned on
     * @return the podcast's notification status
     */
    public boolean getIsNotification()  {
        return this.isNotification;
    }

    /**
     * Gets the rating of the podcast, calculated by the average rating from the ratePodcast method
     * @return the rating of the podcast
     */
    public double getRating()   {
        if (this.rating == 0 )  {
            System.out.println("Not yet been rated");
            return 0;
        }else   {
            return this.rating;
        }
    }

    /**
     * Gets the amount of times the podcast is rated through the ratePodcast method
     * @return the amount of times the podcast is rated
     */
    public int getAmountRated() {
        return this.amountRated;
    }

    /**
     * Gets the list of Episodes
     * @return the list of episodes
     */
    public ArrayList<String> getEpisodeList()  {
        return this.episodeList;
    }

    /*
    Mutators
    */

    /**
     * Changes the name of the podcast
     * @param newName the new name of the podcast
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Changes the followed status of the podcast
     * @param newIsFollowed the new followed status of the podcast
     */
    public void setIsFollowed(boolean newIsFollowed)    {
        this.isFollowed = newIsFollowed;
    }

    /**
     * Changes the notification status of the podcast
     * @param newIsNotification the new notification status of the podcast
     */
    public void setIsNotification(boolean newIsNotification)    {
        this.isNotification = newIsNotification;
    }

    /*
    Other Methods
    */

    /**
     * Rates the podcast with a rating of 1-5 stars
     * @param rateWithStars the rating you would give to the podcast
     */
    public void ratePodcast(int rateWithStars)  {
        if (rateWithStars > 0 && rateWithStars < 6) {
            amountRated++;
            this.rating = (this.rating + rateWithStars)/amountRated;
        } else  {
            System.out.println("Your rating is higher than 5 stars or lower than 1 star");
        }

    }

    /**
     * Add an episode to the podcast
     * @param episode the episode that is added to the podcast
     */
    public void addEpisode(Episode episode)    {
        this.episodeList.add(episode.getName());
    }

    /**
     * sort the episodes by alphabetical order by their name
     */
    public void sortEpisodesAlphabetically()  {
        Collections.sort(episodeList);
    }

    /**
     * displays the attributes of the podcast
     * @return the attributes of the podcast
     */
    public String toString()    {
        String attributes;
        String ratingErrorDetection;

        if(this.rating == 0)    {
            ratingErrorDetection = "No Rating";
        }else   {
            ratingErrorDetection = String.valueOf(this.rating);
        }

        attributes = "\nName: " + this.name + "\nFollowing: " + this.isFollowed + "\nRating: " + ratingErrorDetection + "\nHow many People Rated: " + this.amountRated + "\nIs Notification On: " + this.isNotification + "\nEpisodes in " + this.name + ": " + this.episodeList;
        return attributes;
    }

    //testing every method
    public static void main(String[] args) {

        //constructors for new episode classes
        Episode episode1 = new Episode ("Michael", true, false );
        Episode episode2 = new Episode ("Jessica", false, true);
        Episode episode3 = new Episode ("James", true, false);

        //constructors for podcast classes
        Podcast podcast = new Podcast("ICS Podcast", true, true);

        //testing accessors
        System.out.println("Accessors");
        System.out.println("Name: " + podcast.getName());
        System.out.println("Is it Followed: " + podcast.getIsFollowed());
        System.out.println("Rating: " + podcast.getRating());
        System.out.println("How Many People Rated: " + podcast.getAmountRated());
        System.out.println("Notified: " + podcast.getIsNotification());
        System.out.println("Not filled in Ep list: " + podcast.getEpisodeList());
        System.out.println();

        //testing mutators
        System.out.println("Mutators");
        podcast.setName("Bad ICS Podcast");
        System.out.println(podcast.getName());
        podcast.setIsFollowed(false);
        System.out.println(podcast.getIsFollowed());
        podcast.setIsNotification(false);
        System.out.println(podcast.getIsNotification());
        System.out.println();

        //testing the other methods
        System.out.println("Other Methods");
        System.out.println("Demo: Rating the Podcast");
        podcast.ratePodcast(5);     //works as it is within 1-5 stars
        System.out.println(podcast.getRating());
        podcast.ratePodcast(2);     //rating averages out
        System.out.println(podcast.getRating());
        podcast.ratePodcast(234);       //does not work as it is not within 1-5 stars
        System.out.println(podcast.getRating());
        System.out.println();

        //Add Episodes to Podcast
        podcast.addEpisode(episode1);
        podcast.addEpisode(episode2);
        podcast.addEpisode(episode3);
        System.out.println();

        //Sorting the episodes alphabetically
        System.out.println("Demo: Sorting Alphabetically");
        System.out.println("Without Sorting");
        System.out.println(podcast.getEpisodeList());
        podcast.sortEpisodesAlphabetically();
        System.out.println("After Sorted");
        System.out.println(podcast.getEpisodeList());
        System.out.println();

        //Demonstrating toString
        System.out.println("Demonstrating toString()");
        System.out.println(podcast.toString());

    }
}

