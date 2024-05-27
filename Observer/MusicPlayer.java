package Behavioral.Observer;
import java.util.ArrayList;
import java.util.List;


public class MusicPlayer implements MusicSubject {
    private List<Listener> listeners = new ArrayList<>();

    @Override
    public void registerListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(String song) {
        for (Listener listener : listeners) {
            listener.update(song);
        }
    }


    public void playMusic(String song) {
        System.out.println("Playing: " + song);
        notifyListeners(song);
    }
}
