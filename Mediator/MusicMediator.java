package Behavioral.Mediator;

public class MusicMediator implements Mediator {
    private MusicPlayer musicPlayer;
    private Equalizer equalizer;
    private Playlist playlist;

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void setEqualizer(Equalizer equalizer) {
        this.equalizer = equalizer;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof MusicPlayer && event.equals("play")) {
            equalizer.adjust();
        } else if (sender instanceof Playlist && event.equals("next")) {
            musicPlayer.play();
        }
    }
}
