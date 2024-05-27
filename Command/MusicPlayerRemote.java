package Behavioral.Command;

public class MusicPlayerRemote {
    private Command playCommand;
    private Command pauseCommand;
    private Command stopCommand;

    public MusicPlayerRemote(Command play, Command pause, Command stop) {
        this.playCommand = play;
        this.pauseCommand = pause;
        this.stopCommand = stop;
    }

    public void pressPlayButton() {
        playCommand.execute();
    }

    public void pressPauseButton() {
        pauseCommand.execute();
    }

    public void pressStopButton() {
        stopCommand.execute();
    }
}
