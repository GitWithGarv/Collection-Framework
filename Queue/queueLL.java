package Queue;
public class queueLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class circularQueue{
        static Node head = null;
        static Node tail = null;


        //checking the Linked List is empty or not
        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        //enqueue - O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //dequeue - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;

            return front;
        }

        //peek - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        circularQueue q = new circularQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}



// OUTPUT -
// 1
// 2
// 3
// 4
// 5
// 6
// 7


// circular queue take O(1) time complexity for enqueue, dequeue and peek operations.