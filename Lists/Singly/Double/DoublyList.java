package Double;

public class DoublyList {
    private Node head ;
//    private Node tail;
    private int size ;
    public DoublyList(){
        this.size =0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev=null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        size++;
    }
    public void Display(){
        Node temp = head;
        Node Last = null;
        while (temp!=null){
            System.out.print(temp.val + "--> ");
            Last = temp;
            temp = temp.next;

        }
        System.out.println("End");
        while (Last!=null){
            System.out.print(Last.val + "-->");
            Last= Last.prev;
        }
        System.out.println("Start");
    }
//    public void insertLast(int val){
//        Node temp = new Node(val);
//        Node node = head;
//        temp.next = null;
//        if (head == null) {
//          temp.next = head;
//          head = temp;
//            return;
//        }
//        while (node.next==null){
//            node = node.next;
//        }
//        node.next= temp;
//        temp.prev= node;
////        node = temp;
//
//    }
public void insertLast(int val) {
    Node node = new Node(val);
    Node last = head;

    node.next = null;

    if (head == null) {
        node.prev = null;
        head = node;
        return;
    }

    while (last.next != null) {
        last = last.next;
    }

    last.next = node;
    node.prev = last;
}
public void insertAtRandom(int val,int position){
    Node node = new Node(val);
    Node temp = head;
    if (position == 1) {
        insertFirst(val);
    }
    if (position == size) {
        insertLast(val);
    }
    for (int i = 0; i < position; i++) {
        temp = temp.next;
    }
    node.next = temp.next.next;
    temp.next.next.prev = node;
    temp.next= node;
    node.prev=temp;

}
    public static class Node{
        private Node prev;
        private Node next;
        private int val;

        public Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
}

