package Behavioral.Visitor;

public class MusicPrinterVisitor implements MusicVisitor {
    @Override
    public void visit(Song song) {
        System.out.println("Song: " + song.getTitle() + " by " + song.getArtist());
    }

    @Override
    public void visit(Album album) {
        System.out.println("Album: " + album.getName());
        for (Song song : album.getSongs()) {
            song.accept(this);
        }
    }
}
