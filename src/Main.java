public class Main {

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 1, 0, 0, 8, 0, 9};
        printArray(ShiftZeroes2Endnaive(num1));


    }


    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}