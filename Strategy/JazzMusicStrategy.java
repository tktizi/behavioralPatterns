package Behavioral.Strategy;

public class JazzMusicStrategy implements PlayStrategy {
    @Override
    public void play() {
        System.out.println("Playing jazz music.");
    }
}