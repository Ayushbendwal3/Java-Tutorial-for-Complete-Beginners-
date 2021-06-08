public class Person {
  private String name;
  private int age;

  public Person() {
    this("<Person Name>", 0);
    System.out.println("person object created");
  }

  public Person(String name) {
    this(name, 0);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void speak(String text) {
    System.out.println(text);
  }

  public int calculateYearsToRetirement() {
    return 65 - age;
  }

  public void setInfo(String name, int age) {
    setName(name);
    setAge(age);
  }
}
