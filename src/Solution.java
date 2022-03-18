

public class Solution {


    public static void main(String[] args) {
        char[] array1 = new char[]{'H', 'E', 'L', 'L', 'O'};
        reverseString(array1);
    }

    private static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        for (char c : s) {
            System.out.println(c);

        }

    }


    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
/*  int curr = 0;
        for (int num : nums) {
            curr = Math.max(curr + num, num);
            result = Math.max(curr, result);
        }
        return result;*/


}



