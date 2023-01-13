/**
 * File for a Song class to be used in the Playlist Project
 * @Brandon Chui
 * @1/12
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private double duration; //in minutes
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, double myDuration){
        title = myTitle;
        artist = myArtist;
        duration = myDuration;
        liked = false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
      public String getTitle(){
        return title;
      }

      public String getArtist(){
        return artist;
      }

      public double getDuration(){
        return duration;
      }

      public boolean getLiked(){
        return liked;
      }

      public void setLiked(){
        liked = true;
      }

      public String toString(){
        return "Title: " + title + " Artist: " + artist + " Duration: " + duration  + " Liked: " + liked;
      }
}