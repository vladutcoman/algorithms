package designpatterns.command;

public class TurnTVDown implements Command {

    ElectronicDevice theDevice;

    public TurnTVDown(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }

    @Override
    public void execute() {
        this.theDevice.volumeDown();
    }
}