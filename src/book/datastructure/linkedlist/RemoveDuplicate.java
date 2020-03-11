package book.datastructure.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args) {
        System.out.println("Start...");

        LinkedList<Integer> list = new LinkedList<Integer>();

        // Use add() method to add elements in the list
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list.size());
        removedDuplicatesHash(list);
        System.out.println(list.size());


        System.out.println("End...");
    }

    private static void removedDuplicatesHash(LinkedList<Integer> list) {
        Map<Integer, Boolean> values = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            if (values.containsKey(list.get(i))) {
                list.remove(i);
            } else {
                values.put(list.get(i), true);
            }
        }
    }
}
