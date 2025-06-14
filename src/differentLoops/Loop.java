package differentLoops;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loop {
    public static void main(String args[]){
        System.out.println(" Diffeerent types of method");
        int arr[]={1,2,3,4,5,7,8,9,10};
        for(int i:arr){
            System.out.println(i);
        }
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        for(int i:l){
           // System.out.println(i);
        }
        Map<Integer,Integer> m=new HashMap<>();
        m.put(1,1);
        m.put(2,4 );
        m.put(3,9 );
        m.put(4,16 );
        
        for(Integer i:m.keySet()){
          // System.out.println("key set ="+i);
        }
        for(Integer j:m.values()){
           // System.out.println("value = "+j);
        }
     

    }

}
