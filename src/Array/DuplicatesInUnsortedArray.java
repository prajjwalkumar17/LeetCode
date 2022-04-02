package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicatesInUnsortedArray {

    public static Boolean IsArrayDuplicateUsingHashMap(int[] nums){
        HashMap<Integer,Integer> mapOfArray=new HashMap<>();
        for (int j : nums) {
            Integer value = mapOfArray.get(j);
            if (value == null)
                value = 1;
            else value += 1;
            mapOfArray.put(j, value);
        }

        for(Map.Entry<Integer,Integer> entry:mapOfArray.entrySet()){
            if(entry.getValue()>1)return true;}
        return false;
    }



    public static Boolean IsArrayDuplicateUsingHashedSet(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

}
