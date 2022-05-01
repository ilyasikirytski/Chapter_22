package task_6;

public class StrategyFindingMinMax implements Sorting {
    @Override
    public void sort(int[] arr) {
    }

    @Override
    public void findMinMax(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("minValue: " + minValue);
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("maxValue: " + maxValue);
    }
}
