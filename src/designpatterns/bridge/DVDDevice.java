package designpatterns.bridge;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("DVD skip chapter");
        this.deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("DVD skip 2 chapters");
        this.deviceState++;
    }
}
