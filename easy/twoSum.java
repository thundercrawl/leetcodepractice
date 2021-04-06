import java.util.ArrayList;
import java.util.LinkedList;

public class twoSum
{

    public static void main(final String args[]) {

      
        System.out.println("input as :"+args.length);
        if(args.length != 2)
        {
            System.out.println("Should have two parameters, like 1,2,3,4,7,9  4,5,6,3,0,1");
            return;
        }
    
        final String dices1[] = args[0].split(",");
        final String dices2[] = args[1].split(",");
        if(dices1.length != dices2.length)
        {
            System.out.println("Two list not equal each other");
            return;
        }
        final ArrayList<Integer> dicesInteger1 = new ArrayList<Integer>();
        final ArrayList<Integer> dicesInteger2 = new ArrayList<Integer>();
        
        for (final String i : dices1)
        {
            dicesInteger1.add(new Integer(i));
        }
        for (final String i : dices2)
        {
            dicesInteger2.add(new Integer(i));
        }

        LinkedList<Integer> linkList = new LinkedList<Integer>();

        Integer add1 = 0;
        for(Integer i = 0;i < dicesInteger1.size();i++ )
        {

            if(dicesInteger1.get(i)+dicesInteger2.get(i)+add1 >= 10)
            {
                add1 = 1;
                linkList.add( dicesInteger1.get(i)+dicesInteger2.get(i) -10);
            }
            else 
            {
                 linkList.add( dicesInteger1.get(i)+dicesInteger2.get(i)+add1);
                 add1=0;
            }
            
        }
        if(add1 == 1)
            linkList.add(1);

        for(Integer i: linkList)
        {
            System.out.println(i+"\t");
        }

 
    }
}