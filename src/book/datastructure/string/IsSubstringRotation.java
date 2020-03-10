package book.datastructure.string;

public class IsSubstringRotation {

    public static void main(String[] args) {
        System.out.println("Start...");

        System.out.println(isRotation("waterbottle", "erbottlewat"));

        System.out.println("END...");
    }

    private static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        String res = s2 + s2;

        return res.contains(s1);
    }
}
