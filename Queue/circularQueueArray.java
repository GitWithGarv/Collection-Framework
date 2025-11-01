package Queue;

public class circularQueueArray {

    static class circularQueue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        circularQueue(int n){
            arr = new int[n];
            this.size = n;
        }

        //checking the queue is empty or not
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //checking is the queue is full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //enqueue - O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("the queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //dequeue - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }

            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }

            return result;
        }

        //peek - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        circularQueue q = new circularQueue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

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