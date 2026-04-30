package Inheritance.Super;
///  Super Class

public class Person {

 // instance variables (belong to Person)
 String first;
 String last;

  Person(String first, String last) {
      this.first = first;
      this.last = last;
  }

// Method available to all subclasses
  void showName() {
    System.out.println(this.first + " " + this.last);
  }
}
