package Behavioral.Mediator;

public class MusicPlayer extends Component {
    public MusicPlayer(Mediator mediator) {
        super(mediator);
    }

    public void play() {
        System.out.println("Playing music");
        mediator.notify(this, "play");
    }

    public void stop() {
        System.out.println("Stopping music");
        mediator.notify(this, "stop");
    }
}
