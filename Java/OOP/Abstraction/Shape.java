package OOP.Abstraction;


///  Abstract class: is a restricted class that cannot be used to create objects
///  (to access it, it must be inherited from another class).

/// Abstract method: can only be used in an abstract class, and it does not have a body
///                   The body is provided by the subclass (inherited from[Overide]).

/// Parent Class[SuperClass] & Abstract Class
public abstract class Shape {

abstract double area();  // Abstract Method No Child Class can inherit it we need to overide it


   void display(){ // Concrete Method Can we inherited by SubClasses,no need to Overide it
    System.out.println("These is a Shape");
   }

}
