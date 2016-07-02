package stopwatch.states;

import stopwatch.Stopwatch;

/**
 * Created by Karol on 7/2/2016.
 */
public class Stopped extends State {

    public Stopped(Stopwatch stopwatch) {
        super(stopwatch);
    }

    @Override
    protected void doEntry() {
        stopwatch.showFinalTime();
    }

    @Override
    public void handleB1() {
        stopwatch.startTimer();
        stopwatch.setState(new Running(stopwatch));
    }

    @Override
    public void handleB2() {
        stopwatch.setState(new Idle(stopwatch));
    }
}
