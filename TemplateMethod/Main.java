package Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        MusicTemplate classicalMusic = new ClassicalMusic();
        MusicTemplate popMusic = new PopMusic();

        System.out.println("Playing Classical Music:");
        classicalMusic.playMusic();

        System.out.println("\nPlaying Pop Music:");
        popMusic.playMusic();
    }
}
