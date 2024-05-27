package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Listener fan1 = new MusicFan("John");
        Listener fan2 = new MusicFan("Alice");

        player.registerListener(fan1);
        player.registerListener(fan2);

        player.playMusic("Stairway to Heaven");

        player.removeListener(fan1);

        player.playMusic("Bohemian Rhapsody");
    }
}