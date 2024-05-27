package Behavioral.ChainOfResponsibility;

public class PauseHandler extends MusicHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Pause")) {
            System.out.println("Pausing music...");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// для запиту Pause