/**
 * ClassAndObject
 */
public class ClassAndObject {

  public static void main(String[] args) {
    Person person_1 = new Person();
    Person person_2 = new Person();
    Person person_3 = new Person("Jane Doe", 22);
    Person person_4 = new Person();
    Person person_5 = new Person("Bill");

    person_1.setName("John Doe");
    person_1.setAge(34);

    person_1.speak("Good Morning");

    System.out.println("My Name is : " + person_1.getName());
    System.out.println("My Age is : " + person_1.getAge());
    System.out.println("Years till retirements : " + person_1.calculateYearsToRetirement());

    person_2.setInfo("Ayush", 23);

    System.out.println("My Name is : " + person_2.getName());
    System.out.println("My Age is : " + person_2.getAge());
    System.out.println("Years till retirements : " + person_2.calculateYearsToRetirement());

    System.out.println("My Name is : " + person_3.getName());
    System.out.println("My Age is : " + person_3.getAge());
    System.out.println("Years till retirements : " + person_3.calculateYearsToRetirement());

    System.out.println("My Name is : " + person_4.getName());
    System.out.println("My Age is : " + person_4.getAge());
    System.out.println("Years till retirements : " + person_4.calculateYearsToRetirement());
  }
}