import java.util.Scanner;

/**
 * DoWhile
 */
public class DoWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = 0;

    do {
      System.out.print("Enter a Number : ");
      value = sc.nextInt();
    } while (value != 5);

    System.out.println("Got 5!");
    sc.close();
  }
}