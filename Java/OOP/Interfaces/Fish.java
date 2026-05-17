package OOP.Interfaces;

public class Fish implements Prey, Predator{ // Using 2 Parent(SuperClass)

    @Override
    public void flee() { // Declaration of 1st Superclass method
        System.out.println("Small fishes FLee");
    }
    public  void hunt() { // Declaration of 1st Superclass method
        System.out.println("Large fishes Hunt");
    }


}
