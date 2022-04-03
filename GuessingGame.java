import java.util.Scanner;
public class GuessingGame {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userGuess;
    int correctAnswer = ((int) (Math.random() * 1000));
    int minGuess = 1;
    int maxGuess = 1000;
    do {
      System.out.println("Please enter a value between " + minGuess + " and " + maxGuess);
      System.out.print("Enter your guess: ");
      userGuess = scnr.nextInt();
      if (userGuess >= 1 && userGuess <= 1000) {
        if (userGuess == correctAnswer) {
          System.out.println("Correct!");
        } else if (userGuess > correctAnswer) {
          System.out.println("Lower");
          maxGuess = userGuess - 1;
        } else if (userGuess < correctAnswer) {
          System.out.println("Higher");
          minGuess = userGuess + 1;
         };
       } else {
      System.out.println("Invalid Output");
     };
    } while (userGuess != correctAnswer);
   };
};