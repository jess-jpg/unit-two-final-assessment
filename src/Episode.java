/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: podcast episode
 * group project with James Wong and Jessica Lu
 * doc:
 *
 * Course: ICS4U1
 * Date: April 30, 2022
 * @author Michael Zhou
 */

import java.io.*;

public class Episode {

    /*
    Attributes
    */

    private String name;

    private boolean isExplicit;

    private int playTime;

    private boolean markAsPlayed;

    private double playSpeed;

    private boolean isMostShared;


    /*
    Constructor
    */

    public Episode(String name, boolean isExplicit, boolean isMostShared)    {

            this.name = name;
            this.isExplicit = isExplicit;
            this.isMostShared = isMostShared;  
            
            this.playTime = 0;
            this.markAsPlayed = false;
            this.playSpeed = 1.00;


    }

    /*
    Accessors
    */

    public String getName() {
        return this.name;
    }

    public boolean getIsExplicit() {
        return this.isExplicit;
    }

    public int getPlayTime()    {
        return this.playTime;
    }

    public boolean getMarkAsPlayed()    {
        return this.markAsPlayed;
    }
    public double getPlaySpeed()    {
        return this.playSpeed;
    }

    public boolean getIsMostShared(){
        return this.isMostShared;
    }

    /*
    Mutators
    */

    public void setName(String newName) {
        this.name = newName;
    }

    public void setIsExplicit(boolean newIsExplicit) {
        this.isExplicit = newIsExplicit;
    }

    public void setPlayTime(int newPlayTime) {
        if (newPlayTime < 0) {
            this.playTime = 0;
        } else {
            this.playTime = newPlayTime;
        }
    }

        public void setGetMarkAsPlayed(boolean newGetMarkAsPlayed)  {
            this.markAsPlayed = newGetMarkAsPlayed;
        }

        public void setPlaySpeed(double newPlaySpeed)  {
            if (newPlaySpeed < 0.1)   {
                this.playSpeed = 0.1;
            } else if(newPlaySpeed > 3.0)   {
                this.playSpeed =3.0;
            } else {
                this.playSpeed = newPlaySpeed;
            }
        }

        public void setIsMostShared(boolean newIsMostShared) {
            this.isExplicit = newIsMostShared;
        }


        /*
        Other Methods
        */




    }




