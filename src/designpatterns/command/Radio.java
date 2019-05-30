package designpatterns.command;

public class Radio implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio on");
    }

    @Override
    public void off() {
        System.out.println("Radio off");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println("Radio Volume is: " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.println("Radio Volume is: " + this.volume);
    }

}
