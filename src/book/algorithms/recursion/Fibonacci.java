package book.algorithms.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Start...");
        System.out.println(fib(7));
        System.out.println("End...");
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n > 1) {
            return fib(n-1) + fib(n-2);
        } else {
            return -1;
        }
    }

}
