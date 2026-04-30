package ToString;

///  .toString() = Method inherited from the Object Class
///                Used to Return a String Representation of an Object
///                By Default , it Returns a Hash Code as a Unique identifier
///                It can be Overridden to provide meaningful Details

public class toString {
    public static void main(String[] args) {

    Car car1 = new Car("Ford", "Mustang", "Red", 2025);
    Car car2 =  new Car("Ford", "Porche", "Black", 1998);


        // Java Automatically -> System.out.println(car1.toString());
        // So println(object) automatically calls toString()

        System.out.println(car1); // Instead of Printing classname + Hashcode
                                 // It will Print the return value as we used tostring method
        System.out.println(car2);
}
}
