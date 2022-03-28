package Miscelleneous;

public class ReverseInt {
    public static int reverse(int x) {
        int res = 0;
        int sign = 1;
        int No = 0;
        if (x < 0) {
            sign = -1;
            No = sign * x;
        } else No = x;
        while (No > 0) {
            int rem = No % 10;
            No /= 10;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && rem > 7) {
                return 0;
            }

            if (res < Integer.MIN_VALUE / 10 || res == Integer.MIN_VALUE / 10 && rem < -8) {
                return 0;
            }

            res = res * 10 + rem;

        }
        return (int) (res * sign);
    }
}
