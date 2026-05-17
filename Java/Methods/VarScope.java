package Methods;

/// Variable Scope - Variables are only accessible inside the Method they are created. This is called scope.
/// Function Cannot see inside Another Function
/// 2 Types of Variable Scope - Local & Class
///  Local Variable are Defined inside a Method and Recognized inside that respective method only
/// Global Varaible are Declared Before the Main Method and can be used directly inside other Methods

/// Ex

public class VarScope {

    static int x = 3; // Class (Global)Variable

    static void main(String[] args) {
        int x = 1;     // Local

        System.out.println(x);
        secMethod();

}
static void secMethod(){
        int x = 2;     // Local
        System.out.println(x);
    }
}



