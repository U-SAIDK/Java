package OOP.Inheritance;
/// SUBCLASS (Child)

public class Student extends Person {

// extra property only Student has
  public double gpa;

 public Student(String first, String last, double gpa) {
       super(first, last);     //Run the Person(Parent) constructor before continuing.
       this.gpa = gpa;
 }

 public void show(){
     System.out.println(this.first + " " + this.last + "'s gpa is " + this.gpa);
 }
}
