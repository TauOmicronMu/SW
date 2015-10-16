import java.util.Scanner;
import java.lang.Math;

/* Allows the user to input a number, and returns whether or not the inputted number is square. */

public class Question8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        double inputtedNumber = scanner.nextDouble(); scanner.nextLine();
        if(!(inputtedNumber > 0))
        {
            System.out.println("That number isn't a square");
            return;
        }
        if(!(Math.sqrt(inputtedNumber) % 1 == 0))
        {
            System.out.println("That number isn't a square");
            return;
        }
        System.out.println("That number is a square");
        return;       
    } 
}
