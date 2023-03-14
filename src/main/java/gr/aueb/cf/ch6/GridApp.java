package gr.aueb.cf.ch6;

public class GridApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 2;
        grid[1][1] = 3;

        int[][] grid2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        //another way of initialization
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[5];

        printArray2DIndex(grid2);
        printArray2D(grid);

        System.out.println(arraySum(grid2));

    }

    public static void printArray2DIndex(int[][] grid) {
        //1st way
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray2D(int[][] grid) {
        //2nd way
        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
        }
    }

    public static int arraySum(int[][] grid) {
        int sum = 0;
        for (int[] row : grid) {
            for (int col : row) {
               sum += col;
            }
        }
        return sum;
    }
}
