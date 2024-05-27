package Behavioral.Mediator;

public class Equalizer extends Component {
    public Equalizer(Mediator mediator) {
        super(mediator);
    }

    public void adjust() {
        System.out.println("Adjusting equalizer");
        mediator.notify(this, "adjust");
    }
}
