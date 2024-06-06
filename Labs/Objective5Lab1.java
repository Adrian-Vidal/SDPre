import java.util.Scanner;
public class Objective5Lab1 {
  public static void main(String[] args) {
    


      Scanner input = new Scanner(System.in);
      System.out.println("Enter first whole number between 1 and 100:");
      int num1 = input.nextInt();
      System.out.println("Enter second whole number between 1 and 100:");
      int num2 = input.nextInt();
      

    /*
      Fill in the following logic conditions
    */

    if(num1 > num2) {
      
      System.out.println(num1 + " is greater than " + num2);
      /*
        Your solution goes here
      */
    }
    else if(num2 > num1) {
      
      System.out.println(num1 + " is less than " + num2);
      input.close();
      /*
        Your solution goes here
      */
    }
  }
}