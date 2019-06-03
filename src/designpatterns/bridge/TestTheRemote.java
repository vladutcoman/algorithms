package designpatterns.bridge;

public class TestTheRemote {

    public static void main(String[] args) {

        RemoteButton tv1 = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton tv2 = new TVRemotePause(new TVDevice(1, 200));

        System.out.println("MUTE: ");
        tv1.buttonFivePressed();
        tv1.buttonSixPressed();
        tv1.buttonNinePressed();


        System.out.println("PAUSE: ");
        tv2.buttonFivePressed();
        tv2.buttonSixPressed();
        tv2.buttonSixPressed();
        tv2.buttonSixPressed();
        tv2.buttonSixPressed();
        tv2.buttonSixPressed();
        tv2.buttonSixPressed();
        tv2.buttonNinePressed();
        tv2.buttonNinePressed();

    }

}
