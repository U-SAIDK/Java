package Methods.MethodOverloading;
///  Overload Method = methods that share the same name,
///                   but different Parameters
///       Signature = name + parameters
///  No 2 Method Can Share the Same Signature
///  Method can Share the Same Names But they must have diff list of Parameters to Work

public class Overload {
    static void main(String[] args) {

        System.out.println(add(1, 2, 3 , 4));


    }
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) { // These has the Same name add as
        return a + b + c;                             // previous Function But what makes it Diffrent is the parameters
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

}


