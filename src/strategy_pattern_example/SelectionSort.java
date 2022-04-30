package strategy_pattern_example;

import java.util.Arrays;

//concrete strategy
public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("before selection sort: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("after selection sort: " + Arrays.toString(arr));
    }
}
