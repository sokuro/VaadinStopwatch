package stopwatch.states;

import stopwatch.Stopwatch;

/**
 * Created by Karol on 7/2/2016.
 */
public class Idle extends State {

    public Idle(Stopwatch stopwatch) {
        super(stopwatch);
    }

    @Override
    protected void doEntry() {
        stopwatch.resetTimer();
        stopwatch.showCurrentTime();
    }

    @Override
    public void handleB1() {
        stopwatch.startTimer();
        stopwatch.setState(new Running(stopwatch));
    }

}
