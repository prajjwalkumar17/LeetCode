package Recursion;

public class PrintNto1_fibonacce {


    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);

    }

    static void printnto1(int n) {
        if (n == 0) return;
        System.out.println(n);
        printnto1(n - 1);
    }

    static void print1ton(int n) {
        if (n == 0) return;
        print1ton(n - 1);
        System.out.println(n);

    }


}
