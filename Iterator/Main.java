package Behavioral.Iterator;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        MusicCollection musicCollection = new MusicCollection();
        musicCollection.addTrack(new MusicTrack("Bohemian Rhapsody"));
        musicCollection.addTrack(new MusicTrack("Stairway to Heaven"));
        musicCollection.addTrack(new MusicTrack("Hotel California"));

        // використання ітератора для перебору
        Iterator<MusicTrack> iterator = musicCollection.iterator();
        while (iterator.hasNext()) {
            MusicTrack track = iterator.next();
            System.out.println("Playing: " + track.getTitle());
        }
    }
}