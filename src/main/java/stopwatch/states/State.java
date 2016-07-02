package stopwatch.states;

import stopwatch.interfaces.StopwatchEvents;
import stopwatch.Stopwatch;

/**
 * Created by Karol on 7/2/2016.
 */
public abstract class State implements StopwatchEvents {

    protected Stopwatch stopwatch = null;

    public State (Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public void entry() {
        doEntry();
        doStart();
    }

    public void exit() {
        doStop();
        doExit();
    }

    protected void doStop() {}
    protected void doStart() {}
    protected void doEntry() {}
    protected void doExit() {}

    @Override
    public void handleB1() {

    }

    @Override
    public void handleB2() {

    }
}
