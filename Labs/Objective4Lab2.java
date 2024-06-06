import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5;
    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3;
    int sum = (num1 + num2 + num3);
    double sumdub = (dub1 + dub2 + dub3);
    

    System.out.print("Please enter the first whole number you would like to add.");
    String userInput1 = keyboard.nextLine();
    System.out.println(">> " + num1);
    System.out.print("Please enter the second whole number you would like to add.");
    String userInput2 = keyboard.nextLine();
    System.out.println(">> " + num2);
    System.out.print("Please enter the third whole number you would like to add.");
    String userInput3 = keyboard.nextLine();
    System.out.println(">> " + num3);
    System.out.print("Please enter the first decimal number you would like to add.");
    String userInput4 = keyboard.nextLine();
    System.out.println(">> " + dub1);
    System.out.print("Please enter the second decimal number you would like to add.");
    String userInput5 = keyboard.nextLine();
    System.out.println(">> " + dub2);
    System.out.print("Please enter the third decimal number you would like to add.");
    String userInput6 = keyboard.nextLine();
    System.out.println(">> " + dub3);
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sumdub);



    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}