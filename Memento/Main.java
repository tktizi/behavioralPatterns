package Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        Song song = new Song();
        SongCaretaker caretaker = new SongCaretaker();

        song.set("Imagine", "John Lennon");
        System.out.println("Current song: " + song);
        caretaker.addMemento(song.saveToMemento());

        song.set("Bohemian Rhapsody", "Queen");
        System.out.println("Current song: " + song);
        caretaker.addMemento(song.saveToMemento());

        song.set("Hotel California", "Eagles");
        System.out.println("Current song: " + song);
        caretaker.addMemento(song.saveToMemento());

        System.out.println("Restoring to previous states:");
        song.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored song: " + song);

        song.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Restored song: " + song);
    }
}
