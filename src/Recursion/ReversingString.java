package Recursion;

public class ReversingString {
    public static void reverseWords(String s) {
//        String s = "Let's take LeetCode contest";
//        res=s'teL ekat edoCteeL tsetnoc
        String[] words = s.split(" ");

        StringBuilder res = new StringBuilder();
        for (String iter : words) {
            res.append(new StringBuilder(iter).reverse() + " ");
        }
        System.out.println(res);

    }

    public void reverseString(char[] s) {

        reverseString(s, 0, s.length - 1);
    }

    public char[] reverseString(char[] s, int low, int high) {

        if (low > high) return s;
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        return reverseString(s, low + 1, high - 1);
    }
}
