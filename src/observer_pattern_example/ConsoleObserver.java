package observer_pattern_example;

//observer
public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("weather is changed: temp: " + temp + "; pressure: " + pressure);
    }
}
