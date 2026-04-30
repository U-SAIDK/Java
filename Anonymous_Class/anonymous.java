package Anonymous_Class;

/// Anonymous Class = A Class that doesn't have a Name,It is created and used at the same time.
///                   Cannot be Reused. Add Custom Behaviour without having to Create A New Class.
///                   Often Used for one time Uses(TimerTask, Runnable, Callback)

///  Ex 1

//class Animal{
//    public void sound(){
//        System.out.println("Animal Sound");
//    }
//}
//
//public class anonymous {
//   public static void main(String[] args) {
//
//   // Anonymous class creation
//   Animal animal = new Animal(){
//
//   // overriding parent method
//   @Override
//   public void sound(){
//       System.out.println("Woof Woof");
//   }
//   };
//
//    // calling overridden method
//   animal.sound();
//
//}
//}

/// Ex 2:-

public class anonymous {
   public static void main(String[] args) {

   Dog dog = new Dog();
   Dog dog2 = new Dog(){
      @Override
      void speak(){
      System.out.println("These Dog can Speak");
   }
   };

   dog.speak();
   dog2.speak();

}
}
