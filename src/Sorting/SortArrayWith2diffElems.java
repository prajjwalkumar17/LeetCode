package Sorting;

public class SortArrayWith2diffElems {

    //    Sort an array of 0s, 1s and 2s
    public static void sort012(int a[], int n) {
        int lo = 0, mid = 0;
        int hi = n - 1;
        while (mid <= hi) {
            if (a[mid] == 0) {
                swap(a, mid, lo);
                lo++;
                mid++;
            } else if (a[mid] == 1)
                mid++;
            else {
                swap(a, mid, hi);
                hi--;
            }
        }
    }

    private static void swap(int[] a, int mid, int lo) {
        int temp = a[lo];
        a[lo] = a[mid];
        a[mid] = temp;
    }


}
