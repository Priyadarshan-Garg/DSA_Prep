package Circular;

public class CircularList {
    private Node head;
    private Node tail;
    int size;

    public CircularList(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            tail=node;
            head=node;
            return;
        }
        tail.next = node;
        node.next=head;
        tail= node;
    }
    public void displaly(){
        Node node = head;
        if(head!=null){
            do {
                System.out.print(node.val + "-->");
                node =node.next;
            } while (node!=head);
            System.out.print("End");
        }
    }
    public void deletion(int val){
        Node node = head;
        // for deleting head;
        if(head.val==val){
            head = node.next;
            tail.next= head;
            return;
        }
        while(node.next.val!=val){
            node= node.next;
        }
        node.next= node.next.next;
    }
}
