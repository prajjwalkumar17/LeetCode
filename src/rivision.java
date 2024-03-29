import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rivision {
    public static void main(String[] args) {
        //TODO second largest element in an array
        int[] arr = new int[]{1, 8, 30, 5, 20, 7};
        System.out.println(getPrefixedSum(arr, 4, 3));
    }

    public static int getPrefixedSum(int[] arr, int start, int end) {
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        if (start == 0) return prefixSum[end];
        else return prefixSum[end] - prefixSum[start - 1];
    }

    /*    private static String MinimumFlips(int arr[]){
            int first=arr[0];
            StringBuilder res= new StringBuilder();
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=first){
                    res.append(i).append(" to");
                }
            }
        } */
    private static boolean SubArrayWithGivenSum(int[] arr, int k) {
        int currSum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            while (currSum > k) {
                currSum -= arr[start];
                start++;
            }
            if (k == currSum)
                return true;
        }
        return false;
    }

    private static int MaxSumOfKElements(int[] arr, int k) {
        int prevSum = 0;
        for (int i = 0; i < k; i++)
            prevSum += arr[i];
        int res = prevSum;
        for (int i = k; i < arr.length; i++) {
            prevSum = prevSum + arr[i] - arr[i - k];
            res = Math.max(res, prevSum);
        }
        return res;
    }

    private static int MajorityElement(int arr[]) {
        int curr = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[curr])
                count++;
            else
                count--;
            if (count == 0) {
                curr = i;
                count = 1;
            }
        }
        int freqOfMostOccuredElem = 0;
        for (int i : arr) {
            if (i == arr[curr])
                freqOfMostOccuredElem += 1;
        }
        return freqOfMostOccuredElem > arr.length / 2 ? curr : -1;
    }

    private static int CircularSubarraySum(int[] arr) {
        int normalMaximumSubArraySum = NormalMaxSubArray(arr);
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int inVertedMaximumSubArraySum = arrSum + NormalMaxSubArray(arr);
        return Math.max(inVertedMaximumSubArraySum, normalMaximumSubArraySum);

    }

    private static int NormalMaxSubArray(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    private static void MaximumEvenOddSubarray(int[] arr) {
        int res = 0;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != arr[i - 1] % 2) {
                curr += 1;
                res = Math.max(curr, res);
            } else
                curr = 1;

        }
        System.out.println(res);
    }

    private static void MaximumSubArraySum(int[] arr) {
        int maxEnd = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            res = Math.max(res, maxEnd);
        }
        System.out.println(res);
    }

    private static void MaximumOnes(int[] arr) {
        int res = 0, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                curr = 0;
            else {
                curr += 1;
                res = Math.max(res, curr);
            }
        }
        System.out.println(res);
    }

    private static void TrapRainwaterEFF(int[] arr) {
        int lmaxArr[] = new int[arr.length];
        lmaxArr[0] = arr[0];
        int rmaxArr[] = new int[arr.length];
        rmaxArr[arr.length - 1] = arr[arr.length - 1];
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++)
            lmaxArr[i] = Math.max(arr[i], lmaxArr[i - 1]);
        for (int i = arr.length - 2; i >= 0; i--)
            rmaxArr[i] = Math.max(rmaxArr[i + 1], arr[i]);
        for (int i = 1; i < arr.length - 1; i++)
            res += Math.min(rmaxArr[i], lmaxArr[i]) - arr[i];
        System.out.println(res);
    }

    private static void TrapRainwaterNAiVE(int[] arr) {
        int res = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++)
                lmax = Math.max(lmax, arr[j]);
            int rmax = arr[i];
            for (int k = i; k < arr.length; k++)
                rmax = Math.max(rmax, arr[k]);
            res += Math.min(lmax, rmax) - arr[i];
        }
        System.out.println(res);
    }

    private static void StockBuyAndSell(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                profit += arr[i] - arr[i - 1];
        }
        System.out.println(profit);
    }

    private static void Frequency(int[] arr) {
        int f = 1;
        int i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                f++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + f);
            i++;
            f = 1;
        }
        if (arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2])
            System.out.println(arr[arr.length - 1] + " " + 1);
    }

    private static void MaxDifference(int[] arr) {
        int min = arr[0];
        int maxOutput = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;
            maxOutput = Math.max(diff, maxOutput);
            min = Math.min(min, arr[i]);
        }
        System.out.println(maxOutput);
    }

    private static void PrintLeadersArray(int[] arr) {
        int maxIndex = arr.length - 1;
        System.out.println(arr[maxIndex]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] RotateByDPosEff(int[] arr, int d) {
        ReverseArray(arr, 0, d - 1);
        ReverseArray(arr, d, arr.length - 1);
        ReverseArray(arr, 0, arr.length - 1);
        return arr;
    }

    private static void ReverseArray(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static int[] RotateByDPosNaive(int[] arr, int d) {
        int[] temp = new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        System.arraycopy(temp, 0, arr, arr.length - d, d);
        return arr;
    }

    public static int[] LeftRotateAnArrayByOneClockWise(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
        return arr;
    }

    public static int[] LeftRotateAnArrayByOneAntiClockWise(int[] arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return arr;
    }

    public static int[] MoveZerosToEnd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(i, res, arr);
                res++;
            }
        }
        return arr;
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static int RemoveDups(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        return res;
    }

    public static int[] ReverseAnArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

    public static int LargestNo(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static boolean IsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1] > arr[i])
                return false;
        return true;
    }

    public static int SecondLargestNo(int[] arr) {
        int secondLargestIndex = -1;
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[largestIndex] < arr[i]) {
                secondLargestIndex = largestIndex;
                largestIndex = i;
            } else if (arr[i] < arr[largestIndex]) {
                if (secondLargestIndex == -1)
                    secondLargestIndex = i;
                else if (arr[secondLargestIndex] < arr[i])
                    secondLargestIndex = i;
            }
        }
        return secondLargestIndex;
    }
}
