package Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Imagine", "John Lennon");
        Song song3 = new Song("Hotel California", "Eagles");

        Album album = new Album("Greatest Hits");
        album.addSong(song1);
        album.addSong(song2);
        album.addSong(song3);

        MusicPrinterVisitor printer = new MusicPrinterVisitor();

        album.accept(printer);
    }
}
