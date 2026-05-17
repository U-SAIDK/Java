package OOP.Inheritance;
///  Super Class

public class Person {

 // instance variables (belong to Person)
 public String first;
 public String last;

  public Person(String first, String last) {
      this.first = first;
      this.last = last;
  }

// Method available to all subclasses
  public void showName() {
    System.out.println(this.first + " " + this.last);
  }
}
