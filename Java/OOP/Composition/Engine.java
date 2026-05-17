package OOP.Composition;

//  Engine class represents the Engine part of a Car.
//  This is a smaller object used to build a larger object (Car)
public class Engine {

  String type; // stores engine type (V8, V6, Electric, etc.)


// Constructor initializes engine type
  Engine(String type){
    this.type = type;
  }

}
