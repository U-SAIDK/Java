package For;
import java.util.Scanner;


////    Nested Loop =  A Loop Inside Another Loop
////                   Used Often with matrices or DSA

///  -> For every one iteration of outer loop,
///  -> The inner loop runs COMPLETELY.

//    public class nestedFor {
//    public static void main(String[] args) {
//
//   for(int i=1; i<=3; i++){  // Outer loop: Runs 3 times (controls repetition)  // For Printing Rows
//       for(int j = 1 ; j <=9 ; j++){ // Inner loop: Prints numbers from 1 to 9 // For Printing Columns
//           System.out.print(j + " ");
//       }
//       System.out.println();
// }
//
// }
// }


////  Ex 2 Star Pyrimid Using pattern

  public class nestedFor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n;
    int column;
    char symbol;


    System.out.println("Enter the number of rows");
    n = sc.nextInt();

    System.out.println("Enter the Symbol");
    symbol = sc.next().charAt(0);

       // Outer loop controls the number of rows(total rows = n)
       for (int i = 1; i <= n; i++) {
       // Inner loop (Prints Spaces in decreasing Order)
       for (int j = 1; j <= n - i ; j++){
           System.out.print(" ");
       }
      // 2nd Inner Loop (Prints symbol in increasing Order)
       for (int k = 1; k <= i ; k++){
               System.out.print(symbol + " ");
           }

       System.out.println();
}

}
}

// Ex :- if n= 4 ;  Condtion
//  | Row (i) | n - i | Spaces Printed |
//  | ------- | ----- | -------------- |
//  | 1       | 3     | 3 spaces       |
//  | 2       | 2     | 2 spaces       |
//  | 3       | 1     | 1 space        |
//  | 4       | 0     | 0 spaces       |





