package Matrix;

public class BoundaryTraversal {
    private static void boundaryTraversal(int[][] arr) {
        int[][] num = new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                };
        boundaryTraversal(num);
        if (arr.length == 1)//only one row
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[0][j] + " ");
            }
        else if (arr[0].length == 1)//only one col
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[j][0] + " ");
            }


        else {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[0][j] + " ");

            for (int j = 1; j < arr.length; j++)
                System.out.print(arr[j][arr[j].length - 1] + " ");

            for (int j = arr[0].length - 2; j >= 0; j--)
                System.out.print(arr[arr.length - 1][j] + " ");

            for (int j = 1; j < arr.length - 1; j++)
                System.out.print(arr[j][0] + " ");


        }
    }

}
