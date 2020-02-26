package book.datastructure;

public class RemoveStringDuplicates {

    public static void main(String[] args) {
        System.out.println("WORKS!");

        String string = "aabbccdefatafaz";
        char[] chars = string.toCharArray();

        removeDuplicates(chars);

        System.out.println(chars);

    }

    /** Solution approach */
    private static void removeDuplicates(char[] str) {
        int index = 1;
        for (int i = 1; i < str.length; ++i) {
            int j;

            for (j = 0; j < index; ++j) {
                if (str[i] == str[j]) break;
            }

            if (index == j) {
                str[index] = str[i];
                ++index;
            }

        }

    }
}
