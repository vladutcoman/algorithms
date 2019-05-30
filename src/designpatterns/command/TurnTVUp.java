package designpatterns.command;

public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        this.theDevice.volumeUp();
    }
}