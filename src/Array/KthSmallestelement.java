package Array;

import java.util.Arrays;

/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
        It is given that all array elements are distinct.
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given
        array is 7.*/
public class KthSmallestelement {

    public static void main(String[] args) {
        int[] array1 = new int[]{7, 10, 4, 3, 20, 15};
        System.out.println((getkthSmallestelement(array1, 0, 4, 3)));

    }

    private static int getkthSmallestelement(int[] array, int startingIndex, int endingIndex, int k) {
        Arrays.sort(array);
        return array[k - 1];
    }


/*    private static int[] quicksort(int[] array, int n) {
        if(n==1){
            return array;
        }
        //the biggest element gets fixed to last position
        for (int i=0; i<n; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return quicksort(array, --n);
    }*/
}
