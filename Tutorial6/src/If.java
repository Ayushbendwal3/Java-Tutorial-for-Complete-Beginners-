import java.util.Scanner;

public class If {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number : ");
    int number = sc.nextInt();

    if (number % 2 == 0) {
      System.out.println("Number is even!");
    } else if (number == 0) {
      System.err.println("Zero is whole number");
    } else {
      System.out.println("Number is odd!");
    }

    sc.close();
  }
}