package Recursion;

public class SumofDigits {
    private static int sumofDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumofDigits(n / 10);
    }
}
