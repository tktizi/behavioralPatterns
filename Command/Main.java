package Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Command playMusic = new PlayMusicCommand(player);
        Command pauseMusic = new PauseMusicCommand(player);
        Command stopMusic = new StopMusicCommand(player);

        MusicPlayerRemote remote = new MusicPlayerRemote(playMusic, pauseMusic, stopMusic);

        remote.pressPlayButton();
        remote.pressPauseButton();
        remote.pressStopButton();
    }
}
