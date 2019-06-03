package designpatterns.bridge;

public class DVDRemote extends RemoteButton {

    private boolean play = true;

    public DVDRemote(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {
        this.play = !this.play;
        System.out.println("DVD is playing: " + this.play);
    }
}
