import java.util.*;

public class Question3
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
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).length() > 3)
            {
                list.set(i, list.get(i).substring(0,3)); 
            } 
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
