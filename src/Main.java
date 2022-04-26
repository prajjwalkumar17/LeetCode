import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pair[] pairs = new Pair[]{new Pair(5, 10), new Pair(3, 15), new Pair(18, 30), new Pair(2, 7)};
        mergeIntervals(pairs);


    }

    private static void mergeIntervals(Pair[] pairs) {

    }


}

class Pair {
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}