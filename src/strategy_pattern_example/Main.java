package strategy_pattern_example;

public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] arr = {0, 3, 8, 1, 4};
//        new BubbleSort()
//        new InsertingSort();
        strategyClient.setStrategy(new InsertionSort());
        strategyClient.executeStrategy(arr);
    }
}
