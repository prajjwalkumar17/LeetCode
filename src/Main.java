import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] num1 = new int[]{11, 22, 13, 84};
        char[] num2 = new char[]{'A', 'B', 'a', 'c', 'D'};
        Integer[] arr = new Integer[]{1, 31, 44, 55, 122, 11, 17, 54, 22};
        Arrays.sort(arr, new mycmp());
        System.out.println(Arrays.asList(arr));

    }


}

class mycmp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 || o2 % 2 == 0) return -1;
        else return 1;
    }
}