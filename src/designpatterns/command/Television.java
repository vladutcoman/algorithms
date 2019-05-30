package designpatterns.command;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV on");
    }

    @Override
    public void off() {
        System.out.println("TV off");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println("Volume is: " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.println("Volume is: " + this.volume);
    }
}
