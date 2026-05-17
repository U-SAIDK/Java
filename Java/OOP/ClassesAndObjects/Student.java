package OOP.ClassesAndObjects;

//// A Constructor is Just a Special Method in an CLass

public class Student {

   public String name;
   public int age;
   public double gpa;
   public boolean isEnrolled;

   ///-> Constructor
   /// Constructor Parameters  () that it is Expected to Receive Arguments
   public Student (String name, int age , double gpa){

    // Assign Attributes
   // As Function Cannot see inside Another Function we tell it -
   // object.name = parameter.name ; These Simply Means
   // Put the value passed into the constructor inside this object's variable.
   this.name = name;
   this.age = age;
   this.gpa = gpa;
   this.isEnrolled = true;
}

   public void study(){
      System.out.println(this.name + "is Studying");
   }

}
