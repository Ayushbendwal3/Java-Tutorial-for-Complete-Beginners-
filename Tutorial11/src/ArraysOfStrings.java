/**
 * ArraysOfStrings
 */
public class ArraysOfStrings {

  public static void main(String[] args) {
    String[] words = new String[3];

    words[0] = "Hello";
    words[1] = "to";
    words[2] = "you";

    System.out.println(words[2]);

    String[] fruits = { "apple", "peaches", "kiwi", "banana", "orange" };

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    String[] text = new String[2];

    System.out.println(text[1]);
  }
}