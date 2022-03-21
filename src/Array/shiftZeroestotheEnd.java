package Array;

public class shiftZeroestotheEnd {

    //O(n^2)

    public static int[] ShiftZeroes2Endnaive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }

        }
        return arr;
    }

    //TODO O(n)
    public static int[] ShiftZeroes2EndEffective(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
}
