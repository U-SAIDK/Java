package Arrays.Searching;
import java.util.Scanner;

/// Ex 1:- Program to check if Integer element exist in the Array or not adn give its index number

//    public class SearchArray {
//    static void main(String[] args) {
//
//    int[] numbers = {1, 9, 2, 8, 3, 5, 4};
//    int target = 7;
//    boolean isFound = false;
//
//    // Linear Search
//    for(int i = 0; i < numbers.length; i++){
//        if(target == numbers[i]){
//            System.out.println("Element found at index: " + i);
//            isFound = true;
//        break;
//    }
//
//    }
//    if(!isFound){
//        System.out.println("Element not found in the Array");
//    }
//
//    }
//    }

/// Ex 2:- Program to check if String element exist in the Array or not

//    public class SearchArray{
//    public static void main(String[] args) {
//
//
//    boolean isFound = false;
//    String[] fruits = {"apple", "orange", "banana"};
//    String target = "kiwi";
//
//
//    for (int i = 0; i <fruits.length; i++) {
//    if(fruits[i].equals(target)){  // Use the Build in .equals Method as pass target as argument
//        System.out.println("Element Found at index: " + i);
//        isFound = true;
//    }
//    }
//    if(!isFound){
//        System.out.println("Element Not Found");
//    }
//
//}
//}



////    Ex 3 : User input - Taking User input to ask user to write Size of Array,
////           Element and Find an Element and its index number

//    public class SearchArray{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers ;
//        int size;
//        int target;
//        boolean found = false;
//
//        System.out.println("Enter the size of the array:");
//        size = scanner.nextInt();
//
//        numbers = new int[size];
//
//        for (int i =0 ; i < numbers.length; i++){
//            System.out.println("Enter Elements of Numbers:");
//            numbers[i] = scanner.nextInt();
//        }
//
//        System.out.println("Enter number to find at index");
//        target = scanner.nextInt();
//
//         for(int i = 0; i < numbers.length; i++){
//         if (numbers[i] == target){
//         System.out.println("Your Number " + target+" was Found at index of " + i );
//         found = true;
//      }}
//      if(!found){
//        System.out.println("Your Number "+target+" was not found");
//    }
//
//}
//}


/// Ex -4 User input for String

    public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;
        String target;
        boolean found = false;

        System.out.println("How many Foods You Want:");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.println("Enter the Food Names: ");
            foods[i] = scanner.nextLine();

        }
        System.out.println("Enter the Food you want ");
        target = scanner.nextLine();

        for(int i = 0; i<foods.length; i++){
        if (target.equals(foods[i])) {
            System.out.println("Your Food is Present at index of " + i);
            found = true;}}
            if (!found) {
                System.out.println("Your Food was not found");

                found = false;
            }
}
}
