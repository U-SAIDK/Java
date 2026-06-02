package OOP.Abstraction;

//   Abstraction is Showing essential features while hiding complex details
//   abstract = Used to Define Abstract Classes and Methods
//   Abstraction is the Process of hiding Implementation Details
//   & Showing only the Essential information to the user.;

//   Abstract Classes Can't be instantiated Directly
//   Can contain 'abstract' methods (Which must be implemented)
//   Can contain 'concrete' methods (Which are inherited)

/// Ex:1
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Starting the car engine");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car(); // abstraction
        v.start();
    }
}

/// Ex:-2
//    public class Abstraction {
//    public static void main(String[] args) {
//
//     // Shape shape = new Shape(); // Cannot Create Object of an abstract Class
//
//        Circle circle = new Circle(3);
//        Triangle triangle = new Triangle(4,5);
//        Rectangle rectangle = new Rectangle(6,7);
//
//        circle.display();   // - Calling Concrete Method
//        triangle.display(); // - It will Run As Concrete Method can be Inherited,
//        rectangle.display(); // - The child Classes can access it
//
//
//        System.out.println(circle.area());    // These will Run as we Have Overidden
//        System.out.println(triangle.area());; // the Abstract Method in every Child Class
//        System.out.println(rectangle.area());
//
//
//}
//}