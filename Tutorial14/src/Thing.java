public class Thing {
  public String name;
  public static String description;
  public final static int LUCKY_NUMBER = 7;
  public static int count = 0;

  public Thing() {
    count++;
  }

  public void showName() {
    System.out.println(name);
  }

  public static void showInfo() {
    System.out.println(description);
  }
}
