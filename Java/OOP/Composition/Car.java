package OOP.Composition;

/// * The Engine object is created inside the Car class.

//  COMPOSITION happens here:
// * A Car contains an Engine object.

public class Car {

String model;
int year;
Engine engine; // engine object(Engine Class) declaration

Car(String model, int year,String engineType) {
    this.model = model;
    this.year = year;

  //  COMPOSITION:
  //  Creating an Engine object inside Car.
  //  Engine belongs to this Car only.
  // Call Engine constructor ,Pass "V8" into (engineType)
    this.engine = new Engine(engineType);


}

}
