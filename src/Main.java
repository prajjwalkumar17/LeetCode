import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[][] num = new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {9, 10, 11, 12}
                };
        rotateBy90(num);
    }

    private static void rotateBy90(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }


}

