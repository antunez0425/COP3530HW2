/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop3530hw2;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author aantu009
 */
public class COP3530HW2
{
    //WIP
    public static <AnyType extends Comparable<? super AnyType>>
            boolean subset(List<AnyType> L1, List<AnyType> L2)
    {
        boolean isSubset = true;
        AnyType itemL1;
        AnyType itemL2;
        
        ListIterator<AnyType> iterL1 = L1.listIterator();
        ListIterator<AnyType> iterL2 = L2.listIterator();

        // get first item in each list
        if (iterL1.hasNext() && iterL2.hasNext())
        {
            itemL1 = iterL1.next();
            itemL2 = iterL2.next();
        }
        
        for(int i = 0; i < L1.size(); i++)
        {
            for(int j = 0; i < L2.size(); i++)
            {
                if(itemL1.compareTo(itemL2) == 0)
                {
                    
                }
            }
        }
        
        return isSubset;
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
    }

}
