package Matrix;

public class SpiralMatrix2 {
//    Given a positive integer n, generate an n x n
//    matrix filled with elements from 1 to n2 in spiral order.
//            Input: n = 3
//    Output: [[1,2,3],[8,9,4],[7,6,5]]


    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        if (n == 0) return mat;
        int counter = 1;
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                mat[top][i] = counter++;
            top++;
            for (int i = top; i <= bottom; i++)
                mat[i][right] = counter++;
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    mat[bottom][i] = counter++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    mat[i][left] = counter++;
                left++;
            }

        }
        return mat;
    }
}
