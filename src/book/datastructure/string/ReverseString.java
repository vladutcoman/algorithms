package book.datastructure.string;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("WORKS!");

        System.out.println(reverseString("abcc"));
    }

    private static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i > 0; i--) {
            char character = str.charAt(i);
            reverse += character;
        }

        return reverse;
    }
}
