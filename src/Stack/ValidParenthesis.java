package Stack;

import java.util.ArrayDeque;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        ArrayDeque<Character> l = new ArrayDeque<>();
        if (s.isEmpty()) return true;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                l.push(c);
            else {
                if (l.isEmpty()) return false;
                if (c == '}' && l.peek() == '{') l.pop();
                else if (c == ')' && l.peek() == '(') l.pop();
                else if (c == ']' && l.peek() == '[') l.pop();
                else return false;
            }
        }
        return (l.isEmpty());
    }


}
