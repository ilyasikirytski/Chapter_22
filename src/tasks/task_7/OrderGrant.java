package tasks.task_7;

import java.util.Objects;

public class OrderGrant {
    private State state;
    private int countOfStepsConsideration = 1;

    public void setState(State state) {
        this.state = state;
    }

    public int getCountOfStepsConsideration() {
        return countOfStepsConsideration;
    }

    void nextState() {
        if (state instanceof MyOrder && (state).getName() != null) {
            setState(new CreatedOrder(state.getName()));
            countOfStepsConsideration++;
        } else if (state instanceof CreatedOrder) {
            setState(new ConsideredOrder(state.getName()));
            countOfStepsConsideration++;
        } else if (state instanceof ConsideredOrder && Objects.requireNonNull((state).getName()).length() < 6) {
            setState(new PostponedOrder(state.getName()));
            countOfStepsConsideration++;
        } else if (state instanceof ConsideredOrder && Objects.requireNonNull((state).getName()).length() >= 6) {
            setState(new RejectedOrder(state.getName()));
            countOfStepsConsideration++;
        } else if (state instanceof PostponedOrder) {
            setState(new ConfirmedOrder(state.getName()));
            countOfStepsConsideration++;
        } else if (state instanceof ConfirmedOrder) {
            setState(new WithdrawnOrder(state.getName()));
            countOfStepsConsideration++;
        }
    }

    void getStateOfOrder() {
        state.getStateOfOrder();
    }
}
