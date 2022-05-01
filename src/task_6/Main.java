package task_6;

/*
Паттерн Strategy.
Разработать модель выбора способов сортировки и поиска
максимального/минимального значения массива числовых объектов.
 */
public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();
//        new BubbleSort;
//        new SelectionSort;
        strategyClient.setStrategy(new InsertionSort());
        strategyClient.setStrategyOfFindingMinMax(new StrategyFindingMinMax());
        int[] arr = {9, 1, -98, 8, 2, 102, 7, 3, 6, 4, 5};
        strategyClient.executeStrategy(arr);
    }
}
