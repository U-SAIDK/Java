package OOP.ClassesAndObjects;

///  .ToStringExample() = Method inherited from the Object Class
///                Used to Return a String Representation of an Object
///                By Default , it Returns a Hash Code as a Unique identifier
///                It can be Overridden to provide meaningful Details

public class ToStringExample {
    public static void main(String[] args) {

    CarToString car1 = new CarToString("Ford", "Mustang", "Red", 2025);
    CarToString car2 =  new CarToString("Ford", "Porche", "Black", 1998);


        // Java Automatically -> System.out.println(car1.ToStringExample());
        // So println(object) automatically calls ToStringExample()

        System.out.println(car1); // Instead of Printing classname + Hashcode
                                 // It will Print the return value as we used tostring method
        System.out.println(car2);
}
}
