public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(String data) {
        Node newnode1 = new Node(data);
        if (head == null) {
            head = newnode1;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode1;
    }

    public void print(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+ "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null){
            head = null;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("linked");
        list.addLast("list");
        list.print();

        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
    }
}
