import java.util.LinkedList;

public class LLcollections {
    public static void main(String[] args) {

        //implementation of linked list using collections:
        LinkedList<String> list = new LinkedList<>();

        // Performing operations on linked list:
        list.addFirst("1");       // adding the element at first
        list.add("2");            // adding the element at the end or last
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println(list);
        
        
        int size = list.size();     // give the size of the linked list
        System.out.println(size);

        
        System.out.println(list.get(2));    // give the data present at the index 2 in LL

        
        for(int i = 0 ; i < list.size() ; i ++){    // iterates through the linked list
            System.out.print(list.get(i)+ " --> ");
        }
        System.out.println("Null");


        list.removeFirst();             // removes the current first element of the linked list
        System.out.println(list);
        list.removeLast();              // removes the current last element of the linked list
        System.out.println(list);
        list.remove(1);           // removes the element present at index 3
        System.out.println(list);
    }
}
