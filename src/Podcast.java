
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

        attributes = "\nName: " + this.name + "\nFollowing: " + this.isFollowed + "\nRating: " + ratingErrorDetection + "\nHow many People Rated: " + this.amountRated + "\nIs Notification On: " + "\nEpisodes in " + this.name + ": " + this.episodeList;
        return attributes;
    }

}
