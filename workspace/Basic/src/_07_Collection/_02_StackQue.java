package _07_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _02_StackQue {
   public static void main(String[] args) {
      Stack<Object> stack = new Stack<>();
      Queue<Object> q = new LinkedList<>();

      stack.push(0);
      stack.push(1);
      stack.push(2);
      stack.pop();
      stack.pop();
      // stack.pop();
      System.out.println(stack);

      q.offer(0);
      q.offer(1);
      q.offer(2);
      q.poll();
      q.poll();
      // q.poll();
      System.out.println(q);
   }
}
