import java.util.*;



//implementing Queue using 2 Stacks

public class queueWStack {

    static class Queue{

        //creating 2 stacks
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // performing push operation - O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }


        // // performing pop operation - O(1)
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("The stack is empty");
                return -1;
            }

            int top = s1.pop();

            return top;
        }


        // performing peek operation - O(1)
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("The stack is empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String []args){

        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
