package Behavioral.ChainOfResponsibility;

public class PlayHandler extends MusicHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Play")) {
            System.out.println("Playing music...");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// конкретний обробник для запиту Play