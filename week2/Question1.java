import java.util.*;

public class Question1
{
    public static void main(String[] args)
    {
        int longest = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        while(!s.equals("stop"))
        {
            System.out.print("Enter a string (enter stop to finish): ");
            s = scanner.nextLine();
            if(!s.equals("stop"))
            {
                list.add(s);
            }
            if(s.length() > longest && !(s.equals("stop"))) 
            {
                longest = s.length();
            }
        }
	//System.out.printf("longest == %d\n", longest);
        if(list.size() == 0)
        {
            System.out.println("The list was empty.");
            return;
        }
        System.out.println("The longest string(s) were: ");
        for(int i=0; i<list.size(); i++)
        {
	    //System.out.printf("%s(%d) == %d ?\n", list.get(i), list.get(i).length(), longest);
            if(list.get(i).length() == longest)
            {
                System.out.println(list.get(i));
            }
        }
    }
}
