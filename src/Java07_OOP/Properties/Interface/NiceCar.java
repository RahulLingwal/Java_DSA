package Java07_OOP.Properties.Interface;

public class NiceCar {
    private Engine engine;
    private Media mediaPlayer = new MediaPlayer();

    public NiceCar() {
        this.engine = new PetrolEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void musicStart() {
        mediaPlayer.start();
    }

    public void musicStop() {
        mediaPlayer.stop();
    }
}
