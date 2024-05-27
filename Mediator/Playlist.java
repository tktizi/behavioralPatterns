package Behavioral.Mediator;
import java.util.ArrayList;
import java.util.List;

public class Playlist extends Component {
    private List<String> songs = new ArrayList<>();
    private int currentSongIndex = 0;

    public Playlist(Mediator mediator) {
        super(mediator);
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void playNext() {
        if (currentSongIndex < songs.size() - 1) {
            currentSongIndex++;
            System.out.println("Playing next song: " + songs.get(currentSongIndex));
            mediator.notify(this, "next");
        } else {
            System.out.println("End of playlist");
            mediator.notify(this, "end");
        }
    }

    public void playPrevious() {
        if (currentSongIndex > 0) {
            currentSongIndex--;
            System.out.println("Playing previous song: " + songs.get(currentSongIndex));
            mediator.notify(this, "previous");
        } else {
            System.out.println("Start of playlist");
            mediator.notify(this, "start");
        }
    }
}