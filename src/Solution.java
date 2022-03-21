

public class Solution {


    public static void main(String[] args) {
//        char[] array1 = new char[]{'H', 'E', 'L', 'L', 'O'};
        String quest = "leetcode";
        System.out.println(reverseString(quest));
    }

    private static int reverseString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(String.valueOf(s.charAt(i))) == s.lastIndexOf(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }


    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}



