import java.util.Scanner;
public class Objective9Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    

    System.out.print("Please give me a number: ");
    double num1 = kb.nextDouble();
    System.out.print("Please give me another number: ");
    double num2 = kb.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    kb.close();

  }

  public static double findAverage(double num1, double num2) {
      double average = (num1 + num2) / 2;
      return average;
  }
    
  
}
