package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFromStack {

    Deque<Integer> s1 = new LinkedList<>();
    Deque<Integer> s2 = new LinkedList<>();

    public QueueFromStack() {
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) return -1;
            else {
                while (!s1.isEmpty()) {
                    int data = s1.pop();
                    s2.push(data);
                }
                return (s2.pop());

            }
        } else {
            return (s2.pop());
        }
    }

    public int peek() {
        if (!s2.isEmpty())
            return s2.peek();
        else return s1.peekLast();
    }


    public boolean empty() {
        if (s2.isEmpty() && s1.isEmpty()) return true;
        else return false;
    }
}
