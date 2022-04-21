import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{10, 80, 30, 90, 40, 50, 70};
//        int[] num1 = new int[]{1, 3, -5};
//        ListNode head = new ListNode(10);
//        head.next = new ListNode(20);
//        head.next.next = new ListNode(30);
//        head.next.next.next = new ListNode(40);
//        head.next.next.next.next = new ListNode(50);

        System.out.println((lumotoPartion(num, 0, num.length - 1)));

    }

    private static int lumotoPartion(int[] arr, int low, int high) {
        int index = low - 1;
        //todo if a pivot is supplied in the params then swap high with pivot to make it at high
//        now continue the same array
//        swap(arr[pivot],arr[high]);
        int pivot = arr[high];
        //todo swap all the elems that are low than pivot to inc the lessthan equalto windon
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) swap(arr, ++index, j);
        }
        //todo to swap the pivot to the specified i+1th pos as upto i there are less than eqaul to elems
        swap(arr, ++index, high);
        //todo return i+1
        return index;
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

