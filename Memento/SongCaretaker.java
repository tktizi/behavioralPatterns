package Behavioral.Memento;
import java.util.ArrayList;
import java.util.List;

public class SongCaretaker {
    private final List<SongMemento> mementoList = new ArrayList<>();

    public void addMemento(SongMemento memento) {
        mementoList.add(memento);
    }

    public SongMemento getMemento(int index) {
        return mementoList.get(index);
    }
}


// клас caretaker який зберігає список об'єктів songMemento