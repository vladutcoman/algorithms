package youtube;

import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public static void findNextGreaterElemnt(List<Integer> elements) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(elements.get(0));

        for (Integer item : elements.subList(1, elements.size())) {
            if (stack.empty()) {
                stack.push(item);
            } else {
                Integer topElement = stack.peek();

                while (item > topElement) {
                    System.out.println(topElement + " -> " + item);
                    stack.pop();
                    if (stack.empty()) {
                        break;
                    }
                    topElement = stack.peek();
                }

                stack.push(item);
            }
        }

        while (!stack.empty()) {
            int element = stack.pop();
            System.out.println(element + " ->  no greater");
        }
    }
}
