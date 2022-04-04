package Array;

public class MinimumFlipConsecutive {


    private static void printFlips(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                //do something
                if (arr[i] != arr[0]) System.out.print("From " + i + " to ");
                else System.out.println(i - 1);
            }
        }
        if (arr[arr.length - 1] != arr[0]) System.out.println(arr.length - 1);
    }
}
