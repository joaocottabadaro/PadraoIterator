import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SongTest {


    @Test
    public void deveContarMusicasAdele() {
        Playlist playlist = new Playlist(
                new Song("Baby", "Dilsinho"),
                new Song("Best Friends", "The Weeknd"),
                new Song("Easy On Me", "Adele"),
                new Song("Hello", "Adele")
        );
        assertEquals(2,Spotify.countSongsByArtist(playlist, "Adele"));
    }

    @Test
    public void deveContarTotalMusicasPlaylist() {
        Playlist playlist = new Playlist(
                new Song("Rockstar", "Post Malone"),
                new Song("Feel it Coming", "The Weeknd"),
                new Song("Core e Nomes", "Gilsons"),
                new Song("Started from the Bottom", "Drake")
        );
        assertEquals(4,Spotify.countAllSongsInPlaylist(playlist));
    }
}
