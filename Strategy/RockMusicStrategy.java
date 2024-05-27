package Behavioral.Strategy;

public class RockMusicStrategy implements PlayStrategy {
    @Override
    public void play() {
        System.out.println("Playing rock music.");
    }
}