public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{5, 3, 8, 4, 2, 7, 1, 10};

//        System.out.println((HoarePartion(num, 0, num.length - 1)));

    }


    private static void swap(int[] arr, int low, int high) {

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


}

