package Behavioral.State;

// стан - музика не програється
public class StopState implements State {
    @Override
    public void playMusic() {
        System.out.println("Музика не програється");
    }
}