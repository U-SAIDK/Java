    package Object_Oriented;
/// Overloaded Constructors = Allow a Class to Have Multiple Constructors
///                           With Different Parameter Lists.
///                          Enable Objects to be Initialized in Various Ways


    public class OverloadedConstructors {

    public static void main(String[] args) {

    User user1 = new User("Zavier");
    User user2 = new User("Daniel", "xyz@gmail.com");
    User user3 = new User("Sam", "adsd@gmail.com", 34);
    User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.age);
        System.out.println(user1.email);

        System.out.println();
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
    }


