import java.util.*;

public class Question4
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
        ArrayList<String> newList = new ArrayList<String>();
        for(int i=0; i<list.size(); i++)
        {
            if(!(newList.contains(list.get(i))))
            {
                newList.add(list.get(i));
            }
        }
        for(int i=0; i<newList.size(); i++)
        {
            System.out.println(newList.get(i));
        }
    }
}
