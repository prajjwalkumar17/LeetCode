package Miscelleneous;

public class ContainerWithMostWater11 {

//    Input: height = [1,8,6,2,5,4,8,3,7]
//    Output: 49
//    Explanation: The above vertical lines are
//    represented by array [1,8,6,2,5,4,8,3,7]. In this case,
//    the max area of water (blue section) the container can contain is 49.


    private static int maxContainer(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        for (int i = 0; i < height.length; i++) {
            int currArea = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, currArea);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }
}
