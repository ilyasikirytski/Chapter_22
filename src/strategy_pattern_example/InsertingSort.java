package strategy_pattern_example;

import java.util.Arrays;

//concrete strategy
public class InsertingSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("before inserting sort: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j - 1 > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println("after inserting sort: " + Arrays.toString(arr));
    }
}
