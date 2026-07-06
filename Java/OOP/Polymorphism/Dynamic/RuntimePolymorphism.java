package OOP.Polymorphism.Dynamic;

import java.util.Scanner;

///  Runtime/Dynamic Polymorphism = When The Method That Gets Executed is Decided
///                                 At Runtime Based on the Actual Type of Object.

///  The method that runs is decided while the program is running, not during compilation.
///  Java decides which method to call based on the actual object type, not the reference type.

public class RuntimePolymorphism {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Animal animal; // Declaring Abstract Object

        System.out.print("Would you like a Dog or Cat? (1 = Dog ; 2 = Cat): ");
        int choice = scanner.nextInt();

    if(choice == 1) {
        animal = new Dog();
        animal.speak();
    }
    else if(choice == 2) {
        animal = new Cat();
        animal.speak();
    }

scanner.close();
}
}


/// Runtime polymorphism is when a parent reference refers to different
/// child objects and the overridden method execution is decided at runtime.