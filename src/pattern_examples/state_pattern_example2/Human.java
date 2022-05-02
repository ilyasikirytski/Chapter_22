package pattern_examples.state_pattern_example2;

//context
public class Human {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void goSomething() {
        state.doSomething(this);
    }
}
