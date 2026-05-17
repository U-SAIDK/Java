package OOP.Constructors;

import OOP.ClassesAndObjects.Student;

///   constructor = A Special Method to (Prepare) Initialize Objects
///                 You can pass the Arguments to a Constructor  & Set up initial Values
///                 Initialize = prepare something so it is ready to be used from the start.

public class Constructor {
    public static void main(String[] args) {

// Student() is the Constructor
// new Student(...) means: 👉 “Create a new Student object using the Student blueprint.
// student1 now points to that object in memory.
     Student student1 = new Student("SpongeBob", 30, 3.2);
     Student student2 = new Student("Bob", 35, 6.2);
     Student student3 = new Student("Bobby", 85, 9.2);

        System.out.println(student1.name); // Student 1's Attributes are Printed Here
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);


        System.out.println(student2.name); // Student 2's Attributes are Printed Here
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

}
}
