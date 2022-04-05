package Matrix;

public class SearchingA2DSORTEDMatrix {

    int[][] num1 = new int[][]{
            {10, 20, 30, 40}
            , {15, 25, 35, 45},
            {27, 29, 37, 48}};
    //        searchElemNAIVE(num1,315);
//    searchElemEFFF(num1, 35);


    private static void searchElemNAIVE(int[][] matrix, int a) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == a) System.out.println("Found at (" + i + "," + j + ")");
            }
        }
        System.out.println("Not Found");
    }

    private static boolean searchElemEFFF(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        int col = matrix[0].length - 1;
        int row = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else if (matrix[row][col] < target) row++;
        }
        return false;
    }
}
