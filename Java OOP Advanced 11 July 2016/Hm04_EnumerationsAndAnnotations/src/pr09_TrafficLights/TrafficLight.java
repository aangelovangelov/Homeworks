package pr09_TrafficLights;

public class TrafficLight {

    private Signal signal;

    public TrafficLight(Signal signal) {
        this.signal = signal;
    }

    public void update() {
        switch (this.signal) {
            case GREEN:
                this.signal = Signal.YELLOW;
                break;
            case YELLOW:
                this.signal = Signal.RED;
                break;
            case RED:
                this.signal = Signal.GREEN;
                break;
        }
    }

    @Override
    public String toString() {
        return this.signal.name();
    }
}
