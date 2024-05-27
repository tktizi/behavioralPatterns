package Behavioral.Strategy;

public class MusicPlayer {
    private PlayStrategy playStrategy;

    public MusicPlayer(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    public void setPlayStrategy(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    public void playMusic() {
        playStrategy.play();
    }
}
