package Behavioral.TemplateMethod;

public class PopMusic extends MusicTemplate {
    @Override
    void chooseSong() {
        System.out.println("Choosing a pop song: 'Beat It' by Michael Jackson");
    }

    @Override
    void setVolume() {
        System.out.println("Setting volume to a high level for pop music.");
    }
}
