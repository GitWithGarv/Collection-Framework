import java.util.ArrayList;
import java.util.Collections;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);                         // adding of elements
        System.out.println(list);



        int index = list.get(3);         // get the number present at index 3
        System.out.println(index);
        


        list.add(1,22);          // adding 22 at index 1 and the rest will move one index ahead
        System.out.println(list);



        list.set(2,22);          // sets the value of index 2 as 22
        System.out.println(list);



        list.remove(3);                  // deletes or removes the value at index 3
        System.out.println(list);

        

        int size = list.size();                // tells the size of the arraylist
        System.out.println(size);



        for(int i = 0 ; i < list.size(); i++){      // iterating or using the loops through the arraylist
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();



        Collections.sort(list);                   // sorting of arraylist
        System.out.println(list);
    }
}