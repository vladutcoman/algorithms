package designpatterns.command;

import java.util.List;

public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : this.theDevices) {
            device.off();
        }
    }
}
