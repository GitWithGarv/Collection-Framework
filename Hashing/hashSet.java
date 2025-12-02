import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        
        // creating
        HashSet<Integer> set = new HashSet<>();

        // adding elements
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(3);         // it wont be added because set contains unique elements only;

        // searching/counting
        if(set.contains(5)){
            System.out.println("5 is present");
        }
        if(!set.contains(4)){
            System.out.println("4 is not present");
        }

        // print
        System.out.println(set);
        
        
        // size
        System.out.println("Size: " + set.size());


        // deleting
        set.remove(5);
        System.out.println(set);


        // Iterator
        Iterator s = set.iterator();

        while(s.hasNext() == true){
            System.out.println(s.next());
        }
    }
}
