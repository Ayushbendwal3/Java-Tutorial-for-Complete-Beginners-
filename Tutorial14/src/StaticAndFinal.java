/**
 * StaticAndFinal
 */
public class StaticAndFinal {
  public static void main(String[] args) {
    Thing.description = "I'm a thing";
    Thing.showInfo();

    System.out.println("Counter before: " + Thing.count);

    Thing th1 = new Thing();
    Thing th2 = new Thing();

    System.out.println("Counter After: " + Thing.count);

    th1.name = "Bob";
    th2.name = "Sue";

    System.out.println(Thing.LUCKY_NUMBER);
    System.out.println(th1.name);
    System.out.println(th2.name);
  }
}