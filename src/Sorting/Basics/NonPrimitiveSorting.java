package Sorting.Basics;

import java.util.Arrays;
import java.util.Comparator;

public class NonPrimitiveSorting {
//    Point[] arr={new Point(2,4),new Point(16,2),new Point(16,7)};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i].x+"   "+arr[i].y);

    //Even odd sorting
//
//    Integer[] arr = new Integer[]{1, 31, 44, 55, 122, 11, 17, 54, 22};
//        Arrays.sort(arr, new mycmp());
//        System.out.println(Arrays.asList(arr));

    class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //TODO method 1
        @Override
        public int compareTo(Point o) {
            if (this.x > o.x) return 1;
            else if (this.x == o.x) {
                if (this.y > o.y) return 1;
                else return -1;
            } else return -1;
        }
    }


    //TODO method 2
    class mycomp implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {

            return -1;
        }
    }
}

class mycmp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 || o2 % 2 == 0) return -1;
        else return 1;
    }
}

