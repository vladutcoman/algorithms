package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();


        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        TurnTVUp upCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(upCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-----------------------------------------------------

        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();

        devices.add(tv);
        devices.add(radio);

        TurnItAllOff turnItAllOff = new TurnItAllOff(devices);
        DeviceButton turnAllOff = new DeviceButton(turnItAllOff);
        turnAllOff.press();


    }

}
