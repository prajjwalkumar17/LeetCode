package Sorting.Algos;

import java.util.Arrays;

public class CycleSort {
    private static void cycleSort(int[] arr) {
        for (int cs = 0; cs < arr.length - 1; cs++) {
            int item = arr[cs];
            int countPos = cs;
            for (int i = cs + 1; i < arr.length; i++) {
                if (item > arr[i]) countPos++;
            }
            int temp = item;
            item = arr[countPos];
            arr[countPos] = temp;
            while (countPos != cs) {
                countPos = cs;
                for (int i = cs + 1; i < arr.length; i++) {
                    if (item > arr[i]) countPos++;
                }
                temp = item;
                item = arr[countPos];
                arr[countPos] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
