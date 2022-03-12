import java.util.ArrayList;
import java.util.List;

public class SubsetsOfSetJava {

    public static void main(String[] args) {

        String commaSeparatedString = "aa,bb,cc";
        String[] stringToProcess = separateStrings(commaSeparatedString);

        List<List<String>> subsets = new ArrayList<>();
        subsetsHelper(subsets, new ArrayList<>(), stringToProcess, 0);


        for (List<String> subset : subsets) {
            System.out.println(subset);
        }
    }

    private static void subsetsHelper(List<List<String>> list, List<String> resultList, String[] nums, int start) {
        list.add(new ArrayList<>(resultList));

        for (int i = start; i < nums.length; i++) {
            // add element
            resultList.add(nums[i]);
            // Explore
            subsetsHelper(list, resultList, nums, i + 1);
            // remove
            resultList.remove(resultList.size() - 1);
        }
    }

    private static String[] separateStrings(String commaSeparatedString) {
        String[] arrayStrings = commaSeparatedString.split("[,]", 0);
        return arrayStrings;
    }

}
