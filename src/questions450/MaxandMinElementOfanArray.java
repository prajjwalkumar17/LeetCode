package questions450;

public class MaxandMinElementOfanArray {
    public static void main(String[] args) {

        int arr[] = new int[]{2, 3, 4, 5, 6};

        minMaxPair pair = maxandminelement(arr);
        System.out.println("The max element is " + pair.max);
        System.out.println("The min element is " + pair.min);
        //time complexity=O(n)
    }

    private static minMaxPair maxandminelement(int[] arr) {
        minMaxPair pair = new minMaxPair();
        if (arr.length == 1) {
            pair.min = arr[0];
            pair.max = arr[0];
            return pair;
        }
        if (arr[0] > arr[1]) {
            pair.max = arr[0];
            pair.min = arr[1];
        } else {
            pair.max = arr[1];
            pair.min = arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > pair.max) {
                pair.max = arr[i];
            } else if (arr[i] < pair.min) {
                pair.min = arr[i];
            }
        }
        return pair;
    }

    static class minMaxPair {
        int min;
        int max;
    }
}
