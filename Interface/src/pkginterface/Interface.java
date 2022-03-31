package pkginterface;

interface ICamera {

    void click();

    void record();
}

interface IMusicPlayer {

    void play();

    void pause();

    void stop();

}

class Phone {

    public void call() {
        System.out.println("Calling");
    }

    public void sms() {
        System.out.println("SMS");
    }

}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    @Override
    public void click() {
        System.out.println("Camera is Clicking");

    }

    @Override
    public void record() {
        System.out.println("Camera is recording");

    }

    @Override
    public void play() {
        System.out.println("Music is Play");

    }

    @Override
    public void pause() {
        System.out.println("Music is Pause");

    }

    @Override
    public void stop() {
        System.out.println("Music is Stop");

    }

}

public class Interface {

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        Phone p = s;
        ICamera c = s;
        IMusicPlayer m = s;

        p.call();
        p.sms();

        c.click();
        c.record();

        m.play();
        m.pause();
        m.stop();

    }

}
