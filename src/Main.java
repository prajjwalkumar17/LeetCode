public class Main {


    public static void main(String[] args) {

        int[][] num1 = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        searchElemEFFF(num1, 10);
    }

    private static void searchElemEFFF(int[][] matrix, int target) {
        int colNo = 0;
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            if (matrix[0][i] <= target) {
                colNo = i;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][colNo] == target) {
                return true;
            }
        }
        return false;
    }
//
//    private static boolean searchElemEFFF(int[][] matrix, int target) {
//        int colNo = 0;
//        for (int i = matrix[0].length-1; i >=0; i--) {
//            if (matrix[0][i] < target) {
//                colNo = i;
//                break;
//            }
//        }
//        System.out.println(colNo);
//        for(int i=0;i<matrix.length;i++){
//            if(matrix[i][colNo]==target){
//                return true;
//            }
//        }
//       return false;
//    }


    public static void printArray(int[] nums) {
        for (long i : nums) {
            System.out.println(i);
        }
    }
}