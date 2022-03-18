package questions450;

public class ReversingCharArray {
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
}
