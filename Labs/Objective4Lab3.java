import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int currentYear;

    currentYear = 2024;
    

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();


    System.out.println("You were born in " + (currentYear - age));
    input.close();
  }
}