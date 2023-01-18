/**
 * File for a Song class to be used in the Playlist Project
 * @Brandon Chui
 * @1/12
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int min;
    private int sec;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, int myMin, int mySec){
        title = myTitle;
        artist = myArtist;
        min = myMin;
        sec = mySec;
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

      public double getMin(){
        return min;
      }

      public double getSec(){
        return sec;
      }

      public String getLiked(){
        if(liked == true){
          return "liked";
        }else{
          return "unliked";
        }
      }

      public void setLiked(){
        liked = true;
      }

      public String toString(){
        return "Title: " + title + " - Artist: " + artist + " - Duration: " + min + ":" + sec + " - Status: " + getLiked();
      }
}