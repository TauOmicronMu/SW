import java.util.Scanner;

/*Allows the user to input numbers until a negative number is inputted.
At this point, the program will display the lowest number presented to it
by the user; discounting the negative.*/

public class Question2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean negativeInputted = false;
        boolean firstNumber = true;
        int smallestNumber = 0;
        while(!negativeInputted)
        {
            System.out.print("Input a number: ");
            int inputtedNumber = scanner.nextInt(); scanner.nextLine();
            if(!(inputtedNumber < 0))
            {
                if(firstNumber)
                //Always make the first number the smallest so far.
                {
                    smallestNumber = inputtedNumber;
                    firstNumber = false;
                }
                else if(inputtedNumber < smallestNumber)
                //If it wasn't the first number, compare it with the previous smallest.
                {
                    smallestNumber = inputtedNumber;
                }
            }
            else
            {
                System.out.println("The smallest number was: " + smallestNumber);
                negativeInputted = true;
            }
        }
    }
}
