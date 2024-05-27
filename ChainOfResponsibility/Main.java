package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // створення обробників
        MusicHandler playHandler = new PlayHandler();
        MusicHandler pauseHandler = new PauseHandler();
        MusicHandler stopHandler = new StopHandler();

        // побудова ланцюжка
        playHandler.setNextHandler(pauseHandler);
        pauseHandler.setNextHandler(stopHandler);

        playHandler.handleRequest("Play");
        playHandler.handleRequest("Pause");
        playHandler.handleRequest("Stop");
        playHandler.handleRequest("Skip"); // запит який не обробляється жодним обробником
    }
}
