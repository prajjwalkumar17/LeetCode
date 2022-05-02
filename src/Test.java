import java.math.BigInteger;
import java.util.*;

public class Test {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noofPeople = sc.nextInt();
        int[] arr = new int[noofPeople];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
            sum += arr[i];
        }
        int res = 0;
        for (int i : arr) {
            res += i * (sum - i);
        }

        System.out.println(res);
    }


}


