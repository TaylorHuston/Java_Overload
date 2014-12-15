/*
 * Squares two ints or two doubles.
 * Used to demonstrate Method Overloading
 * Based on "Java How To Program, 10/e, Early Objects" - Chapter 6.
 */

public class Overload {

      public static void main(String[] args) {
         System.out.printf("Square of integer 9 is %d%n", square(9));
         System.out.printf("Square of double 6.5 is %.2f%n", square(6.5));
      }
 
      //Integers version
      public static int square(int intValue) {
         System.out.printf("%nCalled square with integer: %d%n", intValue);
         return intValue * intValue;
      }
 
      //Doubles version
      public static double square(double doubleValue) {
         System.out.printf("%nCalled square with double: %.2f%n", doubleValue);
         return doubleValue * doubleValue;
      }
   } //End of class Overload
