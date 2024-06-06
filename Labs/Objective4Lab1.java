import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "John";
    String lname = "Doe";
    String favoriteAnimal = "Lemur";
    String favoriteFood = "Tacos";
    String favoriteSong = "Twinkle Twinkle Little Star";

    
    System.out.print("What is your first name?");
    String userInput1 = keyboard.nextLine();
    System.out.println(">> " + fname);
    System.out.print("What is your last name?");
    String userInput2 = keyboard.nextLine();
    System.out.println(">> " + lname);
    System.out.print("What is your favorite animal?");
    String userInput3 = keyboard.nextLine();
    System.out.println(">> " + favoriteAnimal);
    System.out.print("What is your favorite food?");
    String userInput4 = keyboard.nextLine();
    System.out.println(">> " + favoriteFood);
    System.out.print("What is your favorite song?");
    String userInput5 = keyboard.nextLine();
    System.out.println(">> " + favoriteSong);
    System.out.println("My name is John Doe.");
    System.out.println("Myfavorite animal is the Lemur.");
    System.out.println("My favorite food is Tacos.");
    System.out.println("My favorite song is Twinkle Twinkle Little Star.");


    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}