package Behavioral.ChainOfResponsibility;

public abstract class MusicHandler {
    protected MusicHandler nextHandler;

    public void setNextHandler(MusicHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}


// інтерфейс для обробників запитів
