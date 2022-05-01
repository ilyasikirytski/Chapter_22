package task_6;

//context(client)
public class StrategyClient {
    private Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
