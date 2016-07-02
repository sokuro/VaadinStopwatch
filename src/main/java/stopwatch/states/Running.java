package stopwatch.states;

import stopwatch.Stopwatch;

/**
 * Created by Karol on 7/2/2016.
 */
public class Running extends State {

    public Running(Stopwatch stopwatch) {
        super(stopwatch);
    }

    @Override
    protected void doStart() {
        stopwatch.showCurrentTime();
    }

    @Override
    public void handleB1() {
        stopwatch.setState(new Intermediate(stopwatch));
    }

    @Override
    public void handleB2() {
        stopwatch.stopTimer();
        stopwatch.setState(new Stopped(stopwatch));
    }
}
