package book.datastructure;

public class StringAnagrams {

    public static void main(String[] args) {
        System.out.println("WORKS!");

        System.out.println(anagram("abcbddd", "adcdbdf"));
    }

    /** My solution */
    private static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;

        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            if (str2.indexOf(character) < 0) {
                return false;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char character = str2.charAt(i);
            if (str1.indexOf(character) < 0) {
                return false;
            }
        }

        return true;
    }

    /** Site solution */
    private static boolean anagramOptimized(String str1, String str2) {

        return true;
    }

}
