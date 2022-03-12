package questions450;

public class Reverse_array {

    //TODO iterative solution
    private static void reversearrayiter1(int[] arr) {
        int startindex = 0;
        int endindex = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[startindex];
            arr[startindex] = arr[endindex];
            arr[endindex] = temp;
            startindex++;
            endindex--;
        }
//Time Complexity O(n)
    }

    private static void reversearrayiter2(int[] arr) {
        int startindex = 0;
        int endindex = arr.length - 1;
        while (startindex < endindex) {
            int temp = arr[startindex];
            arr[startindex] = arr[endindex];
            arr[endindex] = temp;
            startindex++;
            endindex--;
        }

    }
//TODO Recursive solution

    private static int[] reversearrayRecursive(int[] arr, int start, int end) {
        if (start >= end)
            return arr;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reversearrayRecursive(arr, start + 1, end - 1);

        //Time Complexity O(n)
    }


}
