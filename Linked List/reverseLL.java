public class reverseLL {
    Node head;

    class Node{
        int data;
        Node next;
    Node(int data){
        this.data = data;
    }
}

public void add(int data){
    Node newnode = new Node(data);
    if (head == null) {
        head = newnode;
        return;
    }

    Node curr = head;
    while(curr.next != null){
        curr = curr.next;
    }
    curr.next = newnode;
}

public void print(){
    Node curr = head;

    if (head == null){
        System.out.println("List is empty");
        return;
    }

    while(curr != null){
        System.out.print(curr.data+" --> ");
        curr = curr.next;
    }
    System.out.println("Null");
}

public void reverse(){
    if(head == null || head.next == null){
        return;
    }

    Node prev = null;
    Node curr = head;
    // Node next = null;

    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
}

public Node recursiveReverse(Node head){
    if(head == null || head.next == null){
        return head;
    }

    Node newHead = recursiveReverse(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
}

    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(4);

        list.print();
        list.head = list.recursiveReverse(list.head);
        list.print();
    }
}
