package OOP.Inheritance;

///   Inheritance = One Class inherits the Attributes and Methods From another Class
///                 Child <- Parent <- GrandParent
///  superclass = Parent Class ; subclass = Child Class

public class Inheritance {

   public static void main(String[] args) {

   Dog dog = new Dog();
   Cat cat = new Cat();
   Fish fish = new Fish();


       System.out.println(dog.isAlive);
       System.out.println(cat.isAlive);

       System.out.println(dog.isOrganism); // Child <- Parent <- Grandparent
       System.out.println(cat.isOrganism); // Child <- Parent <- Grandparent

       dog.eat(); // Comes from Parent
       cat.eat();
       cat.speak(); // Comes form within themselves

       dog.move();
       cat.move();
       fish.move(); // Method OverRide


}
}
