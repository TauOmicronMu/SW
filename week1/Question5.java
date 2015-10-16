import java.util.Scanner;

/* Allows the user to input a string. The program will return the first character alphabetically. */

public class Question5 
{
    public static void main(String[] args)
    {
        char smallestLetter = 'z';
        boolean firstTime = true;
        System.out.print("Please input a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputtedString = scanner.nextLine().toLowerCase();
        for(int i=0; i<inputtedString.length(); i++)
        {
            if(firstTime)
            {
                smallestLetter = inputtedString.charAt(i);
                firstTime = false;
            }  
            if(inputtedString.charAt(i) < smallestLetter)
            {
                smallestLetter = inputtedString.charAt(i);
            }
        }
        System.out.println("The alphabetically first letter was: " + smallestLetter);
        
     } 
}

