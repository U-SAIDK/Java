package OOP.ClassesAndObjects;


/// Overloaded Constructors = Allow a Class to Have Multiple Constructors
///                           With Different Parameter Lists.
///                          Enable Objects to be Initialized in Various Ways
/// Similar to Overloaded Method , You can Create Methods With Same Names Just Different Parameters

///  Ex -1 -> Simple way to Writing Constructors (Same Names ; Diff Parameters)

public class User {

// When we Create An User Object in other Programme; the Field is Optional

   public String username;
   public String email;
   public int age;


// As No Parameters are Passed, it will Run when there are no Argument
    public User(){
        this.username= "Guest";
        this.email= "Not Provided";
        this.age= 0;
    }

// Use the Constructor and Pass the Parameter , which makes it Mandatory
// to Write As Argument where it is Created and Called
   public User(String username) {
       this.username = username;
       this.email = "Not Provided"; // You cannot Assign Local Variable to it is not passed in Argument
       this.age = 0;                // But you Can Assign it any Value
   }
   public User(String username, String email) {
        this.username = username;
        this.email = email;  // You Can now Assign the Local Varaible as you have Passed it in the Parameters
        this.age = 0;
    }
    public User(String username, String email, int age) {
      this.username = username;
      this.email = email;
      this.age = age;

    }

 }
