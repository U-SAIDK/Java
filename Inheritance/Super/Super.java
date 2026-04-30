package Inheritance.Super;

///   super =  Refers to the Parent Class when using inheritence (superclass = Parent Class -> subclass = Child Class)
///            Used within Constructors and Method Overriding
///            Calls the Parent Constructor to Initialize Attributes

/// It can be used in two main ways:
/// To access attributes and methods from the parent class
/// To call the parent class constructor

public class Super {
    public static void main(String[] args) {

    Person person = new Person("Harry", "Potter");
    Student student = new Student("Hari", "Puttar", 3.45);
    Employee emp = new Employee("Usaid", "Khan", 0);


        // Calls Person's method
        person.showName();

        // Student inherits showName() from Person
        student.showName();

        // Accessing Student's own variable
        System.out.println(student.gpa);

        student.show();

        emp.showSalary();

}
}
