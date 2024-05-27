package Behavioral.State;

public class MusicPlayer {
    private State state;

    public MusicPlayer() {
        this.state = new StopState(); // Початковий стан - зупинено
    }

    public void setState(State state) {
        this.state = state;
    }

    public void playMusic() {
        state.playMusic();
    }
}