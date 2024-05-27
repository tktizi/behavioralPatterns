package Behavioral.Memento;

public class SongMemento {
    private final String title;
    private final String artist;

    public SongMemento(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

   // клас memento який зберігає стан об'єкта song