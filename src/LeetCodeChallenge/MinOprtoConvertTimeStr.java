package LeetCodeChallenge;

/*Input: current = "02:30", correct = "04:35"
        Output: 3
        Explanation:
        We can convert current to correct in 3 operations as follows:
        - Add 60 minutes to current. current becomes "03:30".
        - Add 60 minutes to current. current becomes "04:30".
        - Add 5 minutes to current. current becomes "04:35".
        It can be proven that it is not possible to convert current to correct in fewer than 3 operations.*/
public class MinOprtoConvertTimeStr {
/*    String current = "09:41";
    String correct = "11:34";
        System.out.println(reverseString(current, correct));*/

    public static int min5Diff(int diff, int MinIncrement) {
        if (diff >= 15) {
            MinIncrement += diff / 15;
            diff %= 15;
        }
        if (diff >= 5) {
            MinIncrement += diff / 5;
            diff %= 5;
        }
        if (diff >= 1) {
            MinIncrement += diff;
        }
        return MinIncrement;
    }

    private int convertTime(String current, String correct) {
        int correctMin = Integer.parseInt(correct.substring(3, 5));
        int currentMin = Integer.parseInt(current.substring(3, 5));
        int correctHr = Integer.parseInt(correct.substring(0, 2));
        int currentHr = Integer.parseInt(current.substring(0, 2));
        int MinIncrement = 0;
        int hrIncrement = 0;
        if (correctMin == currentMin) return correctHr - currentHr;
        if (correctMin > currentMin) {
            hrIncrement = (correctHr - currentHr);
            int diff = correctMin - currentMin;
            MinIncrement = min5Diff(diff, MinIncrement);
        } else {
            hrIncrement = (correctHr - currentHr) - 1;
            int diff = (60 - currentMin) + correctMin;
            MinIncrement = min5Diff(diff, MinIncrement);
        }
        return hrIncrement + MinIncrement;
    }
}
