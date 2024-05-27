package Behavioral.Memento;

public class Song {
    private String title;
    private String artist;

    public void set(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public SongMemento saveToMemento() {
        return new SongMemento(title, artist);
    }

    public void restoreFromMemento(SongMemento memento) {
        this.title = memento.getTitle();
        this.artist = memento.getArtist();
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}

//клас який створює об'єкти songMemento для збереження стану та відновлення з них
