package Behavioral.Observer;

public class MusicFan implements Listener {
    private String name;

    public MusicFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String song) {
        System.out.println(name + " is enjoying the song: " + song);
    }
}
