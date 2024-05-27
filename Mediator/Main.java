package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        MusicMediator mediator = new MusicMediator();

        MusicPlayer player = new MusicPlayer(mediator);
        Equalizer equalizer = new Equalizer(mediator);
        Playlist playlist = new Playlist(mediator);

        mediator.setMusicPlayer(player);
        mediator.setEqualizer(equalizer);
        mediator.setPlaylist(playlist);

        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");

        player.play();
        playlist.playNext();
        playlist.playNext();
        playlist.playPrevious();
        player.stop();
    }
}