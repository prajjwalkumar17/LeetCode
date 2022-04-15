package Sorting.Basics;

import java.util.Arrays;
import java.util.Comparator;

public class NonPrimitiveSorting {
//    Point[] arr={new Point(2,4),new Point(16,2),new Point(16,7)};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i].x+"   "+arr[i].y);

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

