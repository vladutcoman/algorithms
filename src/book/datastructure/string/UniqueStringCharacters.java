package book.datastructure.string;

import java.util.HashMap;
import java.util.Map;

public class UniqueStringCharacters {

    public static void main(String[] args) {
        System.out.println("WORKS!");

        isUnique2("abcc");
    }
    /*
    Implement an algorithm to determine if a string has all unique characters.
    What if you can not use additional data structures?
     */

    // My approach
    public static boolean isUnique(String str) {
        Map chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (chars.containsKey(c)) {
                return false;
            }
            chars.put(c, "");
        }
        return true;
    }

    // Book approach
    public static boolean isUnique2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            int val = str.charAt(i);
            System.out.println(val);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static boolean isUnique3(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
}
