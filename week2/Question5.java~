import java.util.*;

public class Question5
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
        ArrayList<String> binList = new ArrayList<String>();
        while(list.size() > 0)
        {
            for(int i=0; i<list.size(); i++)
            {
                /*Removes the first occurence of each string until there is only one occurence left, which will be printed*/
                if(!binList.contains(list.get(i)))
                {
                    binList.add(list.get(i)); //Appends to binList.
                    list.remove(list.get(i)); //Removes the first occurence in list.
	            i--;
                } 
                //System.out.println(list);
                //System.out.println(binList); 
            
            }
            if(list.size() > 0)
            {
                binList.clear();
            }
            //Below is BLACK MAGIC and should never be uncommented other than for sakes of nostalgia of the "meow(owoewrojflskmnfklsnfks)" error.
            /*Accounts for the possibility of more than one most common element
            if(list.size() != 0 && !((list.size() >= 0) && (!list.get(0).equals(binList.get(0)))))
            {
                binList.clear(); //Empties the bin list.
            } 
            */
        }   
        //System.out.println(list);
        //System.out.println(binList);
        //Once the original list is empty, print the remaining bin list.
        for(int i=0; i<binList.size(); i++)
        {
            System.out.println(binList.get(i));
        }
    }
}
