package stopwatch.states;

import stopwatch.Stopwatch;

/**
 * Created by Karol on 7/2/2016.
 */
public class Intermediate extends State {

    public Intermediate(Stopwatch stopwatch) {
        super(stopwatch);
    }

    @Override
    protected void doEntry() {
        stopwatch.showIntermediaTime();
    }

    @Override
    public void handleB1() {
        stopwatch.setState(new Running(stopwatch));
    }

    @Override
    public void handleB2() {
        stopwatch.stopTimer();
        stopwatch.setState(new Stopped(stopwatch));
    }
}
