package Behavioral.Iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class MusicCollection implements Iterable<MusicTrack> {
    private ArrayList<MusicTrack> tracks = new ArrayList<>();

    public void addTrack(MusicTrack track) {
        tracks.add(track);
    }

    @Override
    public Iterator<MusicTrack> iterator() {
        return new MusicIterator(tracks);
    }
}