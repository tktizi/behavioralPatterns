package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class MusicIterator implements Iterator<MusicTrack> {
    private ArrayList<MusicTrack> tracks;
    private int currentIndex = 0;

    public MusicIterator(ArrayList<MusicTrack> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < tracks.size();
    }

    @Override
    public MusicTrack next() {
        return tracks.get(currentIndex++);
    }
}
