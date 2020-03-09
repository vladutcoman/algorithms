package book.datastructure.string;

import java.util.Arrays;

public class RecplaceAllSpaces {

    public static void main(String[] args) {
        System.out.println("Start...");

        System.out.println(replaceWhiteSpaces("ab cc "));

        System.out.println("End...");
    }

    private static String replaceWhiteSpaces(String str) {
        char[] arr = str.toCharArray();
        int spaces = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                spaces++;
            }
        }
        int newLength = arr.length + spaces * 2;
        char[] arr2 = new char[newLength];
        arr2[newLength - 1] = '\0';
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr2[newLength - 1] = '0';
                arr2[newLength - 2] = '2';
                arr2[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                arr2[newLength - 1] = arr[i];
                newLength = newLength - 1; }
        }
        str = Arrays.toString(arr2);
        return str;
    }

}
