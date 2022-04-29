package state_pattern_example2;

//concrete state
public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 2) {
            System.out.println("WeekEnd. Human In sleep");
            count++;
        } else {
            context.setState(new Work());
            context.goSomething();
        }
    }
}
