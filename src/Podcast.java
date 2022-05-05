
/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: podcast
 * group project with James Wong and Jessica Lu
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
    private String name;

    private boolean isFollowed;

    private double rating;      //cannot be controlled in the main

    private int amountRated;      //cannot be controlled in the main

    private boolean isNotification;

    private ArrayList<String> episodeList = new ArrayList<>();

    /*
    Constructor
    */

    public Podcast(String name, boolean isFollowed, boolean isNotification) {

        this.name = name;
        this.isFollowed = isFollowed;
        this.isNotification = isNotification;

        this.amountRated = 0;
        this.rating = 0;
    }

    /*
    Accessors
    */

    public String getName() {
        return this.name;
    }

    public boolean getIsFollowed()   {
        return this.isFollowed;
    }

    public boolean getIsNotification()  {
        return this.isNotification;
    }

    public double getRating()   {
        if (this.rating == 0 )  {
            System.out.println("Not yet been rated");
            return 0;
        }else   {
            return this.rating;
        }
    }

    public int getAmountRated() {
        return this.amountRated;
    }

    public ArrayList<String> getEpisodeList()  {
        return this.episodeList;
    }

    /*
    Mutators
    */

    public void setName(String newName) {
        this.name = newName;
    }

    public void setIsFollowed(boolean newIsFollowed)    {
        this.isFollowed = newIsFollowed;
    }

    public void setIsNotification(boolean newIsNotification)    {
        this.isNotification = newIsNotification;
    }

    /*
    Other Methods
    */

    public void ratePodcast(int rateWithStars)  {
        if (rateWithStars > 0 && rateWithStars < 6) {
            amountRated++;
            this.rating = (this.rating + rateWithStars)/amountRated;
        } else  {
            System.out.println("Your rating is higher than 5 stars or lower than 1 star");
        }

    }

    public void addEpisode(Episode episode)    {
        this.episodeList.add(episode.getName());
    }

    public void sortEpisodesAlphabetically()  {
        Collections.sort(episodeList);
    }

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

        //constructors
        Episode episode1 = new Episode ("Michael", true, false );
        Episode episode2 = new Episode ("Jessica", false, true);
        Episode episode3 = new Episode ("James", true, false);

        Podcast podcast = new Podcast("ICS Podcast", true, true);

        //accessors
        System.out.println("Accessors");
        System.out.println("Name: " + podcast.getName());
        System.out.println("Is it Followed: " + podcast.getIsFollowed());
        System.out.println("Rating: " + podcast.getRating());
        System.out.println("How Many People Rated: " + podcast.getAmountRated());
        System.out.println("Notified: " + podcast.getIsNotification());
        System.out.println("Not filled in Ep list: " + podcast.getEpisodeList());
        System.out.println();

        //mutators
        System.out.println("Mutators");

        podcast.setName("Bad ICS Podcast");
        System.out.println(podcast.getName());

        podcast.setIsFollowed(false);
        System.out.println(podcast.getIsFollowed());

        podcast.setIsNotification(false);
        System.out.println(podcast.getIsNotification());
        System.out.println();

        //other methods
        System.out.println("Other Methods");

        System.out.println("Demo: Rating the Podcast");

        podcast.ratePodcast(5);     //works
        System.out.println(podcast.getRating());
        podcast.ratePodcast(2);     //rating averages out
        System.out.println(podcast.getRating());
        podcast.ratePodcast(234);       //does not work
        System.out.println(podcast.getRating());
        System.out.println();

        //Demo: Add Episodes to Podcast
        podcast.addEpisode(episode1);
        podcast.addEpisode(episode2);
        podcast.addEpisode(episode3);
        System.out.println();

        System.out.println("Demo: Sorting Alphabetically");
        System.out.println("Without Sorting");
        System.out.println(podcast.getEpisodeList());
        podcast.sortEpisodesAlphabetically();
        System.out.println("After Sorted");
        System.out.println(podcast.getEpisodeList());
        System.out.println();

        System.out.println("Demonstrating toString()");
        System.out.println(podcast.toString());

    }
}

