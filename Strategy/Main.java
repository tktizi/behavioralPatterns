package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        // створення стратегій
        PlayStrategy classicalMusic = new ClassicalMusicStrategy();
        PlayStrategy rockMusic = new RockMusicStrategy();
        PlayStrategy jazzMusic = new JazzMusicStrategy();

        // створення програвача з початковою стратегією
        MusicPlayer player = new MusicPlayer(classicalMusic);

        // відтворення
        System.out.println("Initial strategy:");
        player.playMusic();

        System.out.println("\nSwitching to rock music strategy:");
        player.setPlayStrategy(rockMusic);
        player.playMusic();

        System.out.println("\nSwitching to jazz music strategy:");
        player.setPlayStrategy(jazzMusic);
        player.playMusic();
    }
}
