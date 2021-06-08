/**
 * MultiDimArrays
 */
public class MultiDimArrays {

  public static void main(String[] args) {
    int[] values = { 3, 5, 2343 };

    System.out.println(values[2]);

    int[][] grid = { { 3, 5 }, { 8 }, { 1, 2, 9, 6, 7 }, { 1, 1, 1 }, { 1, 2, 3, 4 } };

    System.out.println(grid.length);
    System.out.println(grid[0].length);
    System.out.println(grid[1].length);

    String[][] texts = new String[2][4];

    texts[0][1] = "hello, there!";

    for (String[] row : texts) {
      for (String col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + " ");
      }
      System.out.println();
    }
  }
}