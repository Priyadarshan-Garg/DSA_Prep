package Single;

public class Node {
    public int val;
    public Node next;
//    public Node tail;
    public Node(int data){
        this.val= data;
    }

    public Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }
}
