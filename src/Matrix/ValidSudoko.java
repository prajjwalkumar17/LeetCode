package Matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currVal = board[i][j];
                if (currVal != '.') {
                    if (!set.add(currVal + "found at row" + i) ||
                            !set.add(currVal + "found at col" + j) ||
                            !set.add(currVal + "found at subMat" + i / 3 + " - " + j / 3))
                        return false;
                }
            }
        }
        return true;
    }


}
