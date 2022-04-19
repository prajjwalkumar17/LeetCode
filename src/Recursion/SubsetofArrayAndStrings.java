package Recursion;

public class SubsetofArrayAndStrings {
    static void printSubset(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }

        //array was cheated

        printSubset(str, curr, i + 1);
        printSubset(str, curr + str.charAt(i), i + 1);

    }
}
