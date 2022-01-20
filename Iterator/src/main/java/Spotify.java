import java.util.Iterator;

public class Spotify {


    public static Integer countSongsByArtist(Playlist playlist,  String artist) {
        int count = 0;
        for(Song song : playlist) {
            if(song.getArtistName() == artist) {
                count++;
            }
        }
        return count;
    }

    public static Integer countAllSongsInPlaylist(Playlist playlist) {
        int count = 0;
        for (Iterator a = playlist.iterator(); a.hasNext(); ) {
            count++;
            a.next();
        }
        return count;
    }
}
