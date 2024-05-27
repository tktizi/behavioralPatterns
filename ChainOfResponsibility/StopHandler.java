package Behavioral.ChainOfResponsibility;

public class StopHandler extends MusicHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Stop")) {
            System.out.println("Stopping music...");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}


// для запиту Stop