package Behavioral.TemplateMethod;

public class ClassicalMusic extends MusicTemplate {
    @Override
    void chooseSong() {
        System.out.println("Choosing a classical piece: Beethoven's Symphony No. 5");
    }

    @Override
    void setVolume() {
        System.out.println("Setting volume to a medium level for classical music.");
    }
}