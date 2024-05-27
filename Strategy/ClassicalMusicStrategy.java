package Behavioral.Strategy;

public class ClassicalMusicStrategy implements PlayStrategy {
    @Override
    public void play() {
        System.out.println("Playing classical music.");
    }
}