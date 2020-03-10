package book.datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class RowAndColZero {

    public static void main(String[] args) {
        System.out.println("Start...");

        int[][] multi = new int[][]{
                { 1, 2, 3, 4, 5 },
                { 1, 2, 0, 4, 5 },
                { 1, 2, 3, 4, 0 },
                { 1, 8, 0, 4, 5 },
                { 1, 2, 3, 4, 5 }
        };

        replaceZeros(multi, 5);
        displayMatrix(5, multi);

        int[][] multi2 = new int[][]{
                { 1, 2, 3, 4, 5 },
                { 1, 2, 0, 4, 5 },
                { 1, 2, 3, 4, 0 },
                { 1, 8, 0, 4, 5 },
                { 1, 2, 3, 4, 5 }
        };
        bookSolution(multi2, 5);
        displayMatrix(5, multi2);

        System.out.println("End...");
    }

    private static void replaceZeros(int[][] mat, int n) {
        Map<Integer, Boolean> cols = new HashMap<Integer, Boolean>();
        Map<Integer, Boolean> rows = new HashMap<Integer, Boolean>();
        for (int col = 0; col < n; col++) {
            if (cols.containsKey(col)) {
                break;
            }

            for (int row = 0; row < n; row++) {
                if (cols.containsKey(col)) {
                    break;
                }
                if (mat[col][row] == 0) {
                    replaceCols(mat, n, col);
                    cols.put(col, true);
                    rows.put(row, true);
                }
            }
        }

        rows.keySet().forEach(key -> {
            replaceRows(mat, n, key);
        });
    }

    private static void replaceCols(int[][] mat, int n, int index) {
        for (int i = 0; i < n; i++) {
            mat[index][i] = 0;
        }
    }

    private static void replaceRows(int[][] mat, int n, int index) {
        for (int i = 0; i < n; i++) {
            mat[i][index] = 0;
        }
    }

    private static void displayMatrix(int N, int[][] mat)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /** Book Solution */
    private static void bookSolution(int[][] mat, int n) {
        int[] row = new int[n];
        int[] col = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
