package stopwatch;

import com.vaadin.client.DateTimeService;
import stopwatch.interfaces.StopwatchEvents;
import com.vaadin.ui.TextField;
import stopwatch.states.State;

/**
 * Created by Karol on 7/2/2016.
 */
public class Stopwatch implements StopwatchEvents {

    private State state = null;
    TextField display;
//    DateTimeService timer;

    @Override
    public void handleB1() {

    }

    @Override
    public void handleB2() {

    }

    public void setState(State state) {
        this.state = state;
        state.entry();
    }

    public void resetTimer() {}

    public void showCurrentTime() {}

    public void startTimer() {}

    public void stopTimer() {}

    public void showIntermediaTime() {}

    public void showFinalTime() {}
}
