package Array;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
        return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1

        Example 3:
        Input: nums = [1,3,5,6], target = 7
        Output: 4*/

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 5, 6};
        System.out.println(searchinsertposition(array1, 7));
    }


    private static int searchinsertposition(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            } else if (array[i] > target) {
                return i;
            }
        }
        return array.length;
    }
}
