
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bala J
 */
public class MyDistanceSort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        
        LocationTraffic l1 = (LocationTraffic)o1;
        LocationTraffic l2 = (LocationTraffic)o2;
        
        if (l1.dis<l2.dis)
        {
            return -1;
        }
        
        return 1;
        
        
    }
    
}
