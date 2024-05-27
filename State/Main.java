package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.playMusic();

        // зміна стану
        player.setState(new PlayState());
        player.playMusic();

        player.setState(new StopState());
        player.playMusic();
    }
}
