/**
 * Arrays
 */
public class Arrays {

  public static void main(String[] args) {
    int value = 7;
    int[] values = new int[value];

    for (int i : values) {
      System.out.println(i);
    }

    values[0] = 1;
    values[1] = 2;
    values[2] = 3;
    values[3] = 4;
    values[4] = 5;
    values[5] = 6;
    values[6] = 7;

    System.out.println("##################");

    for (int i : values) {
      System.out.println(i);
    }

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i);
    }
  }
}