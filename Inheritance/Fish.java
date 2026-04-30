package Inheritance;
/// Ex of Method Overriding :-
/// Method overriding = Child class replaces/Overrides a method that already exists in the parent class.
///
public class Fish extends Animal{

 @Override
 void move(){
     System.out.println("Animal is Swimming");
 }

}
