package Interfaces;

///  Another way to achieve abstraction in Java, is with interfaces.
///  Interface = A blueprint of a class , that is used to group related methods with empty bodies:
///  Supports Mutiple inheritance-like Behavior
/// interface Class - you cannot Create an Object of it

///Ex - 1

// interface Animal{
//
//// All methods inside an interface are:public + abstract (by default)
//// Any class implementing Animal MUST define this method
//
// void animalSound(); // interface method (does not have a body)
// void sleep(); // interface method (does not have a body)
//}
//
//// "implements" keyword is used to inherit an interface
//class Dog implements Animal{
//
//// Must be PUBLIC because interface methods are public by default
//    @Override
//    public void animalSound() {
//        System.out.println("The Dog says: bhow bhow");
//    }
//
//    @Override
//    public void sleep(){
//        System.out.println("Zzz");
//    }
//
//}
//
// public class Interface {
//    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//
//       dog.animalSound();
//       dog.sleep();
//}
//}


///  Ex - 2
/// In Abstraction Child Can have only one Parent but in interface child can have multiple Parents

public class Interface {
    public static void main(String[] args) {

    Rabbit rabit = new Rabbit();
    Hawk hawk = new Hawk();
    Fish fish = new Fish();

    rabit.flee();
    hawk.hunt();

    fish.flee(); // Can use both Method from 2 Parent interfaces
    fish.hunt();

}
}






