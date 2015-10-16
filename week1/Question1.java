import java.util.Scanner;

/*Allows the user to input a number. The program will then return all of the
even numbers between (and including) 0 and the number inputted.*/

public class Question1
{
    public static void main(String[] args)
    {    
        System.out.print("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt(); scanner.nextLine();
        for(int i=0; i<inputtedNumber; i+=2)
        { 
            System.out.println(i);
        }
    }
}

