import java.util.*;

public class queuecollections{
    public static void main(String []args){

        // Linked List implementation of Queue
        // Queue<Integer> q = new LinkedList<>();


        // here linked list is a class and queue is an interface. and objects are created for classes not interfaces. so we have to write like this.

        //ArrayDeque implementation of Queue
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}