package Strings;

import java.util.HashMap;
import java.util.Map;

public class canContainString383 {
//    Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.
//            Example 1:
//    Input: ransomNote = "a", magazine = "b"
//    Output: false
//
//    Example 2:
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false
//
//    Example 3:
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true

    public boolean canConstruct(String ransomNote, String magazine) {
        //Method 1 array
        int[] freq = new int[26];
        for (char ch : magazine.toCharArray())
            freq[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {
            if (freq[ch - 'a'] > 0) freq[ch - 'a']--;
            else return false;
        }
        return true;

//        //Method 2 Map
//        Map<Character,Integer> map=new HashMap<>();
//        for(char ch : magazine.toCharArray()){
//            if(map.containsKey(ch))map.put(ch,map.get(ch)+1);
//            else map.put(ch,1);
//        }
//        for(char ch : ransomNote.toCharArray()){
//            if(map.get(ch)==null || map.get(ch)<=0)return false;
//            else map.put(ch,map.get(ch)-1);
//        }
//        return true;
    }

}
