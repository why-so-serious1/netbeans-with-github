/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset.exp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Chanpreet
 */
public class HashSetExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        hash.add(5);
        hash.add(6);
        hash.add(5);
        hash.add(4);
        
        hash.add(4);
        Iterator itr=hash.iterator();
        while(itr.hasNext())
            
        { int x=(int)itr.next();
            if(x==4)
            {
                
            }
                
        }
    }
    
}
