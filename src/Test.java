import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    //    {1,2,3,5}
    public static void main(String[] args) {
        String str = "prajjjwal";
    }

    private static char MaxOcuuringElem(String str) {
        Map<Character, Integer> resMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (resMap.containsKey(ch))
                resMap.put(ch, resMap.get(ch) + 1);
            else
                resMap.put(ch, 1);
        }
/*        char res;
        Iterator<Map.Entry<Character,Integer>> itr=resMap.entrySet().iterator();
        while()*/
        return 'a';
    }
}




