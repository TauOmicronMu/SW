import java.util.*;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.print("Enter a string (enter stop to finish): ");
        String s = scanner.nextLine();
        while(!s.equals("stop"))
        {
            list.add(s);
            System.out.print("Enter a string (enter stop to finish): ");
            s = scanner.nextLine();
        }
        if(list.size() == 0)
        {
            System.out.println("The list was empty.");
        } 
        for(int i=(list.size()-1); i>=0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
