package Behavioral.Visitor;

public interface MusicVisitor {
    void visit(Song song);
    void visit(Album album);
}
