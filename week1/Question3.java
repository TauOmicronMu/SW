import java.util.Scanner;

/*Allows the user to input a number. The program will then display a pattern consisting of
rows of n asterisks, n-1 asterisks and so on until 1 asterisk.*/

public class Question3
{
    public static void main(String[] args)
    {
        boolean firstTime = true;
        System.out.print("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt(); scanner.nextLine();
        for(int i = inputtedNumber; i>0; i--)
        {
            if(!firstTime)
            {
                System.out.println("*");
            }
            else
            {
                firstTime = false;
            }
            for(int j=0; j<i-1; j++)
            { 
               System.out.print("*");
            }
        }
        System.out.println("*"); //Finish it off.
    }
}
