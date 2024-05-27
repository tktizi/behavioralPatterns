package Behavioral.TemplateMethod;

public abstract class MusicTemplate {

    public final void playMusic() {
        chooseSong();
        setVolume();
        play();
        stop();
    }

    abstract void chooseSong();
    abstract void setVolume();

    void play() {
        System.out.println("Playing the song...");
    }

    void stop() {
        System.out.println("Stopping the song...");
    }
}
