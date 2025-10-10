public class middleele {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void middleElement(){
        Node middle = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            middle = middle.next;
            fast = fast.next.next;
        }
        System.out.println(middle.data);
    }

    public static void main(String[] args) {
        middleele list = new middleele();
        list.insert("1");
        list.insert("2");
        list.insert("3");
        list.insert("4");
        list.insert("5");

        list.print();

        list.middleElement();
    }
}
