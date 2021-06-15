public class StringBufferAndStringFormatting {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    sb.append("My name is Sue.");
    sb.append(" ");
    sb.append("I am a lion tamer");
    System.out.println(sb.toString());

    StringBuilder s = new StringBuilder();
    s.append("My name is Ayush.").append("I am a Compture Science Engineer.").append("I am from Indore.")
        .append("Hello there.");

    System.out.println(s.toString());

    // Formatting

    System.out.printf("total cost %10d; quantity is %d\n", 5, 120);

    for (int i = 1; i <= 20; i++) {
      System.out.printf("%2d: %s\n", i, "Some text");
    }

    System.out.printf("total value: %.2f\n", 5.237343);
    System.out.printf("total value: %6.1f\n", 323453542.2342);
  }
}
