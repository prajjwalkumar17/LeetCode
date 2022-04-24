package Sorting.Algos;

public class NaivePartition {
    static int naivePartition(int[] arr, int low, int high, int p) {
        int[] temp = new int[high - low + 1];
        int index = 0;

        //todo copying the small & equal elem than pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] < arr[p]) temp[index++] = arr[i];
        }
        for (int i = low; i <= high; i++) {
            if (arr[i] == arr[p]) temp[index++] = arr[i];
        }

        //todo index of pivot will be last elem presently as in case of duplicates
        int res = low + index - 1;

        //todo copying the greater elements
        for (int i = low; i <= high; i++) {
            if (arr[i] > arr[p]) temp[index++] = arr[i];
        }

        //todo copying the temp to array
        System.arraycopy(temp, 0, arr, 0, temp.length);


        return res;

    }


}
