package Strings;
/*    Input: s = "001101"
    Output: 6
    Explanation:
    The following sets of indices selected are valid:
            - [0,2,4] from "001101" forms "010"
            - [0,3,4] from "001101" forms "010"
            - [1,2,4] from "001101" forms "010"
            - [1,3,4] from "001101" forms "010"
            - [2,4,5] from "001101" forms "101"
            - [3,4,5] from "001101" forms "101"
    No other selection is valid. Thus, there are 6 total ways.*/

public class NumberOFwaysTOSelectABuilding {


    private static long selectBuilding(String s) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int l = j + 1; l < s.length(); l++) {
                    if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(l)) {
                        count++;
                    }
                }
            }

        }
        return count;
    }

}
