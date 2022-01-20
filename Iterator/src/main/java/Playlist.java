import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playlist implements  Iterable<Song>{

    private List<Song> songs = new ArrayList<>();

    public Playlist(Song... songs) {
        this.songs = Arrays.asList(songs);
    }

    @Override
    public Iterator<Song> iterator() {
        return songs.iterator();
    }
}
