import java.util.*;

/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: Profile
 * group project with James Wong and Jessica Lu
 *
 * Course: ICS4U1
 * Date: May 8, 2022
 * @author Michael Zhou
 */


public class Profile {

    /*
    Attributes
    */

    private String name;

    private int followers;

    private int following;

    private int playlistAmount;

    private ArrayList<String> publicPlaylist = new ArrayList<>();

    /*
    Constructor
    */

    public Profile(int followers, int following, AccountSettings accountSettings) {
        this.followers = followers;
        this.following = following;
        this.name = accountSettings.getDisplayName();

        this.playlistAmount = 0;
    }

    /*
    Accessors
    */

    public String getName() {
        return this.name;
    }

    public int getFollowers() {
        return this.followers;
    }

    public int getFollowing() {
        return this.following;
    }

    public int getPlaylistAmount() {
        return this.playlistAmount;
    }

    public ArrayList<String> getPublicPlaylist() {
        return this.publicPlaylist;
    }

    /*
    Mutators
    */

    public void setName(String newName) {
        this.name = newName;
    }

    public void setFollowers(int newFollowers) {
        if (newFollowers > 0) {
            this.followers = newFollowers;
        } else {
            this.followers = 0;
        }
    }

    public void setFollowing(int newFollowing) {
        if (newFollowing > 0) {
            this.following = newFollowing;
        } else {
            this.following = 0;
        }
    }

    /*
    Other Methods
    */

    public void AddPlaylist(Playlist playlist) {
        this.playlistAmount++;
        if (playlist.getIsPublic()) {
            this.publicPlaylist.add(playlist.getTitle());
        } else {
            System.out.println("Cannot add playlist since its not public");
        }
    }

    public String toString() {
        String attributes;
        attributes = "Name: " + this.name + "\nFollowers: " + this.followers + "\nFollowing: " + this.following + "\nPlaylist Count: " + this.playlistAmount + "\nPlaylist Displayed: " + this.publicPlaylist;

        return attributes;
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {
        Playlist playlist1 = new Playlist ("My Guilty Pleasure");
        Playlist playlist2 = new Playlist ("Soundtrack that People Listen to");
        Playlist playlist3 = new Playlist ("Songs that I like");

        AccountSettings account = new AccountSettings ("Bob123", "password", "bob123@gmail.com", "Bob Music Lover", "04121990");

        Profile profile = new Profile (12,34, account);

        //accessors
        System.out.println("Accessors");
        System.out.println("Name: " + profile.getName());
        System.out.println("Followers: " + profile.getFollowers());
        System.out.println("Following: " + profile.getFollowing());

        System.out.println("Profile without adding playlists");
        System.out.println("Playlist Count: " + profile.getPlaylistAmount());
        System.out.println("Public Playlists: " + profile.getPublicPlaylist());
        System.out.println();

        //mutators
        System.out.println("Mutators");

        profile.setFollowers(50);
        System.out.println(profile.getFollowers());

        profile.setFollowing(0);
        System.out.println(profile.getFollowing());

        profile.setName("Joe Biden");
        System.out.println(profile.getName());

        //other methods
        System.out.println("Adding 3 playlists");
        profile.AddPlaylist(playlist1);
        profile.AddPlaylist(playlist2);
        profile.AddPlaylist(playlist3);

        System.out.println("Profile with adding playlists");
        System.out.println("Playlist Count: " + profile.getPlaylistAmount());
        System.out.println("Public Playlists: " + profile.getPublicPlaylist());
        System.out.println();

        System.out.println(profile.toString());
    }



    
}
