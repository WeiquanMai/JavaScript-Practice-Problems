/*
    Exercise: Chessboard

    Write a program that creates a string that represents an 8x8 grid,
    using newline characters to separate lines.
    At each position of the grid, there is either a space, or a '#' character.
    The characters should form a chessboard.

    When you have a program that generates this pattern, define a binding size = 8,
    and change the program so that it works for any size, outputting a grid of the given width and height;
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Initialize a string to store even pattern and string for odd pattern
        String evenString = "";
        String oddString = "";

        // Ask user for grid size
        System.out.print("Enter size of grid: ");
        int size = input.nextInt();

        // Input validation on size
        while(size <= 1){
            System.out.println("Invalid size. Size must be greater than 1");
            System.out.print("Enter size of grid: ");
            size = input.nextInt();
        }

        // Iterate through size, and generate pattern for evenString and oddString
        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                evenString += " ";
                oddString += "#";
            }
            else if (i % 2 == 1){
                evenString += "#";
                oddString += " ";
            }
        }

        // Iterate through again and call corresponding string
        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                System.out.println(evenString);
            }
            else{
                System.out.println(oddString);
            }
        }

        // Close scanner
        input.close();
    }
}
