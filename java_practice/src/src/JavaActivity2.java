import java.util.HashSet;
import java.util.*;

public class JavaActivity2 {
    public static void main (String [] args){

        int count[] = {34,66,87,33,78,33,99,55,24,68,3,1,1};
        Set<Integer> set = new HashSet<Integer>();
        try{
            for(int i = 0; i < count.length; i++){
                set.add(count[i]);
            }
            System.out.println(set);
        } catch (Error e){
            System.out.println(e);
            System.out.println("Cannot have multiple values");
        }
    }
}