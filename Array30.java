import java.util.*;

/**
 * Write a description of Array30 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array30 {
    public void main(){
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i<=30; i=i+2){
            list.add(i);
        }
        
        int[] myArray = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            myArray[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(myArray));
    }
    
}
