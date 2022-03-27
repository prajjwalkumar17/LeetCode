

public class Main {

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 2, 3, 4, 5, 90};
        printArray(kthPalindrome(num1, 3));
    }


    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] result = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = nthPalindrome(queries[i], intLength);
        }
        return result;
    }

    // Utility function to reverse the number n
    static int reverseNum(int n) {
        int rem, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    // Boolean Function to check for palindromic
// number
    static boolean isPalindrom(int num) {
        return num == reverseNum(num);
    }

    // Function for finding nth palindrome of k digits
    static int nthPalindrome(int n, int k) {
        // Get the smallest k digit number
        int num = (int) Math.pow(10, k - 1);

        while (true) {
            // check the number is palindrom or not
            if (isPalindrom(num))
                --n;

            // if n'th palindrome found break the loop
            if (n == 0)
                break;

            // Increment number for checking next palindrome
            ++num;
        }

        return num;
    }


    public static void printArray(long[] nums) {
        for (long i : nums) {
            System.out.println(i);

        }
    }
}