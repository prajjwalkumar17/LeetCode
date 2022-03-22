public class Main {

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 1, 0, 0, 8, 0, 9};
        printArray(rotateArrayDPosauxD(num1, 2));

    }

    private static int[] rotateArrayDPosauxD(int[] arr, int d) {
        int[] tempArr = new int[d];
        for (int j = 0; j < d; j++)
            tempArr[j] = arr[j];

        for (int i = d; i < arr.length; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[arr.length - d + i] = tempArr[i];
        return arr;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}