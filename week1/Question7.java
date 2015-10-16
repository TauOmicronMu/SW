import java.util.Scanner;

/* Allows the user to input a number, and returns whether or not the inputted number is prime. */

public class Question7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int inputtedNumber = scanner.nextInt(); scanner.nextLine();
        if(inputtedNumber <= 1)
        {
            System.out.println("That number is not prime");
            return;
        }
        else if(inputtedNumber == 2)
        {
            System.out.println("That number is prime");
            return;
        }
        else if(inputtedNumber % 2 == 0)
        //Discount all even numbers.
        {
            System.out.println("That number is not prime");
            return;
        }
        for(int i=3; i<(inputtedNumber); i+=2)
        { 
            if(inputtedNumber % i == 0)
            {
                System.out.println("That number is not prime");
                return;
            }
        }
        System.out.println("That number is prime");
    }
}

