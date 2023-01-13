/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @Brandon Chui
 * @1/12
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist SleepSongs = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        SleepSongs.addSong(new Song("Hot", "Young Thug, Gunna", 3.22));
        SleepSongs.addSong(new Song("Wants and Needs", "Drake, Lil Baby", 3.22));
        SleepSongs.addSong(new Song("No Suburban, Pt. 2", "Sheff G", 2.57));
        SleepSongs.addSong(new Song("Dahdahdah", "Nardo Wick", 2.53));
        SleepSongs.addSong(new Song("Dior", "Pop Smoke", 3.6));
        SleepSongs.addSong(new Song("Capo", "NLE Choppa", 3.2));
        SleepSongs.addSong(new Song("Runnin", "21 Savage, Metro Boomin", 3.27));
        SleepSongs.addSong(new Song("Knife Talk", "Drake, 21 Savage, Project Pat", 4.05));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(SleepSongs.examineSongs());

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        Playlist.likeSong(1);
        Playlist.likeSong(3);
        Playlist.likeSong(5);

        System.out.println("Printing the songs...\n");
        System.out.println(SleepSongs.examineSongs());

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        Playlist.removeSong("Hot");
        Playlist.removeSong("Dior");
        Playlist.removeSong("Runnin");

        System.out.println("Printing the songs...\n");
        System.out.println(SleepSongs.examineSongs());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(SleepSongs.likedSublist());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(Playlist.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        Playlist.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(SleepSongs.examineSongs());
    }
}