import java.util.Scanner;

/* Allows the user to input a string. The program will return all characters alphabetically. */

public class Question6 
{
    public static void main(String[] args)
    {
        char smallestLetter = 'z';
        boolean firstTime = true; 
        System.out.print("Please input a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputtedString = scanner.nextLine().toLowerCase(); //lowercase letters have higher ASCII values than uppercase ones.
        for(int j=0; j<inputtedString.length(); j++)
        //loop to find  j smallest letters, where j is the length of the inputted string.
        {
            for(int i=0; i<inputtedString.length(); i++)
            //loop through i letters in order to return 1 smallest letter, where i is the length of the inputted string.
            {
                if(firstTime)
                //The very first letter will always be the smallest, regardless of what it is.
                {
                    smallestLetter = inputtedString.charAt(i);
                    firstTime = false;
                }  
                if(inputtedString.charAt(i) < smallestLetter)
                {
                    smallestLetter = inputtedString.charAt(i);
                }
            } 
            firstTime = true; //The first letter in the next pass will always be smallest too.
            String smallestLetterString = "" + smallestLetter;
            System.out.println(smallestLetter);
            //replaces the first occurence of the smallest letter with a tilde because the ASCII value
            //is higher than all letters.
            inputtedString = inputtedString.replaceFirst(smallestLetterString, "~");
            smallestLetter = 'z';
        }
    } 
}

