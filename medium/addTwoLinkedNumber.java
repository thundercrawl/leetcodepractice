import java.util.ArrayList;

public class addTwoLinkedNumber
{

    public static void main(final String args[]) {
        final Integer arg1, arg2;

      
        System.out.println("input as :"+args.length);

        if(args.length != 2)
        {
            System.out.println("Should have two parameters, like 1,2,3,4,7,9  11");
            return;
        }
        arg2 = new Integer(args[1]);
        final String dices[] = args[0].split(",");
        final ArrayList<Integer> dicesInteger = new ArrayList<Integer>();
        for (final String i : dices)
        {
            dicesInteger.add(new Integer(i));
        }

        for(Integer i=0; i <=dicesInteger.size()-2; i++ )
        {
        
            if( dicesInteger.get(i) >= arg2)
                return;
            for(Integer j=i+1;j<=dicesInteger.size()-1;j++)
            {
                if( dicesInteger.get(i)+dicesInteger.get(j) == arg2)
                {
                    System.out.println("find result:"+i+":"+j);
                    return;
                }
                if(dicesInteger.get(i)+dicesInteger.get(j) > arg2 )
                continue;
            }
        }

 
    }
}