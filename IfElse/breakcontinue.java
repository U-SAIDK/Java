package IfElse;
// break and Continue
// break = Break out of a Loop(STOP)
// continue = Skip current cycle of a loop (SKIP)

/// Break Ex -
// public class breakcontinue {
//    static void main(String[] args) {
//
//  for (int i =0; i <= 10; i++) {
//      if (i == 4)
//      {
//          break;      // These will break the Loop once it reaches 4(0,1,2,3)
//      }
//      System.out.printf("%d\n", i);
//  }
//}
//}

////  continue -
public class breakcontinue {
    static void main(String[] args) {

        for (int i =0; i <= 10; i++) {
            if (i == 4)
            {
                continue;      // These will skip 4 as in the condition and print rest of the numbers
            }
            System.out.printf("%d\n", i);
        }
}
}