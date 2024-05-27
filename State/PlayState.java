package Behavioral.State;

// стан - музика програється
public class PlayState implements State {
    @Override
    public void playMusic() {
        System.out.println("Музика програється");
    }
}
