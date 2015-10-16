import java.util.Scanner;

/*Allows the user to input a string. The string will be returned in reverse order. The program will display whether or not the string was palindromic.*/

public class Question4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a string: ");
        String originalString = scanner.nextLine().toLowerCase();
        String reversedString = new StringBuilder(originalString).reverse().toString();
        //Uses StringBuilder's reverse method to reverse the original string.
        System.out.println(originalString + " Backwards is: " + reversedString);
        if(originalString.equals(reversedString))
        //Determines whether the input was palindromic.
        {
            System.out.println("That was a palindrome!");
        }        
        else
        {
            System.out.println("That was not palindromic :(");
        }
    }
}
