import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100; // You can adjust the upper bound as needed.
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfTriesCount = 0;
        boolean hasGuessedCorrectly = false;
        int maxnumberOfTries = 10;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTriesCount++;
            
            if ((userGuess < lowerBound || userGuess > upperBound) && numberOfTriesCount<=maxnumberOfTries){
                System.out.println("Your guess is out of the valid range. Please guess between " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + numberOfTriesCount + " tries.");
                break;
            }
            if(hasGuessedCorrectly!=true && numberOfTriesCount == 10){
            System.out.println("You were not able to make it so the Guess number was " + " "+numberToGuess);
            return;
            }
        }
            
            
        }
        
    }

