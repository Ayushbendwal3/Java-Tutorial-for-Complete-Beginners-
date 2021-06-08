import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Name: ");
    String firstName = sc.next();
    System.out.print("Enter Last Name: ");
    String lastName = sc.next();
    System.out.print("Enter House Number : ");
    int houseNo = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Locality : ");
    String locality = sc.nextLine();

    System.out.println("Details----------->");
    System.out.printf("Name: %s %s\n", firstName, lastName);
    System.out.println("Address: " + houseNo + " " + locality);

    sc.close();
  }
}