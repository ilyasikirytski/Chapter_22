package pattern_examples.state_pattern_example2;

//concrete state
public class Work implements Activity {
    private int countOfWorkDay = 0;

    @Override
    public void doSomething(Human context) {
        if (countOfWorkDay < 5) {
            System.out.println("In work...");
            countOfWorkDay++;
        } else {
            context.setState(new WeekEnd());
            context.goSomething();
        }
    }
}
