package book.datastructure.stacksandqueues;

import java.util.Stack;

public class QueueOfStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enQueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    int deQueue() {
        if (stack1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        return stack1.pop();
    }
}
