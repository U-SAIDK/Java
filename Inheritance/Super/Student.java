package Inheritance.Super;
/// SUBCLASS (Child)

public class Student extends Person {

// extra property only Student has
  double gpa;

 Student(String first, String last, double gpa) {
       super(first, last);     //Run the Person(Parent) constructor before continuing.
       this.gpa = gpa;
 }

 void show(){
     System.out.println(this.first + " " + this.last + "'s gpa is " + this.gpa);
 }
}
