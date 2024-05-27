package Behavioral.Observer;

public interface MusicSubject {
    void registerListener(Listener listener);
    void removeListener(Listener listener);
    void notifyListeners(String song);
}
