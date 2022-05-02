package tasks.task_6;

//context(client)
public class StrategyClient {
    private Sorting strategy;
    private Sorting strategyOfFindingMinMax;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void setStrategyOfFindingMinMax(Sorting strategyOfFindingMinMax) {
        this.strategyOfFindingMinMax = strategyOfFindingMinMax;
    }

    void executeStrategy(int[] arr) {
        strategy.sort(arr);
        strategyOfFindingMinMax.findMinMax(arr);
    }
}
