import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @Brandon Chui
 * @1/12
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        playlist = new ArrayList<Song>();
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    //Adding a song
    public void addSong(Song a){
        playlist.add(a);
    }

    //'liking' a song
    public void likeSong(int x){
        Song s = playlist.get(x);
        s.setLiked();
    }

    //Removing a specific song
    public void removeSong(String remove){
        for(int i = 0; i < playlist.size(); i++){
            if(remove.equals(playlist.get(i).getTitle())){
                playlist.remove(i);
                i--;
            }
        }
    }

    //Examining all Songs (a String return or void print makes sense here)
    public String examineSongs(){
        String toString = "";
        for(int i = 0; i < playlist.size(); i++){
            Song a = playlist.get(i);
            toString += a.toString() + "\n";
        }
        return toString;
    }

    //Examining a sublist of all liked songs
    public String likedSublist(){
        String toStringSublist = "";
        for(Song a : playlist){
            if(a.getLiked() == "liked"){
                toStringSublist += a.toString() + "\n";
            }
        }
        return toStringSublist;
    }

    //Determining the total duration of all songs
    public String totalDuration(){
        int min = 0;
        int sec = 0;
        for(int i = 0; i < playlist.size(); i++){
            min += playlist.get(i).getMin();
            sec += playlist.get(i).getSec();
        }
        if(sec > 59){
            min += (sec / 60);
            sec = sec % 60;
        }
        String totalDuration = min + ":" + sec;
        return totalDuration;
    }
    
    //Removing all unliked songs from the playlist
    public void removeUnliked(){
        for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getLiked() == "unliked"){
                playlist.remove(i);
                i--;
            }
        }
    }
}