package Single;

public class SinglyList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head= node;
        if(tail==null){
            tail = head;
        }
        size =size+1;
    }
    public void Display(){
        Node temp = head;
      while (temp!=null){
          System.out.print(temp.val + "--> ");
          temp = temp.next;
      }
        System.out.println("END");
    }
    public void insertLast(int val){
        Node X = new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next = X;
        tail = X;
        size++;
    }
    public void insertAtRandom(int val, int position){
        if (position==0){
            insertFirst(val);
            return;
        }
        if(position==size){
            insertLast(val);
            return;
        }
        Node temp  = head;
        for (int i = 1; i <position ; i++) {
            temp =temp.next;
        }
        Node X = new Node(temp.next,val);
        temp.next = X;

    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public Node getNode(int position){
        Node node = head;
        for (int i = 0; i <position ; i++) {
            node =node.next;
        }
    return node;}
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node SecondLast = getNode(size-2);
        int val = tail.val;
        SecondLast.next = tail;
        tail.next=null;
      return val; }
    public int deleteAtRandom(int position){
        if(position==0){
            return deleteFirst();
        }
        if (position == size-1) {
            return deleteLast();
        }
        Node prev = getNode(position-1);
        int val = prev.next.val;;
        prev.next = prev.next.next;
        return val;
    }
    public Node insertRec(int val,int position){
        Node temp = head;
        if(position == 0){
            Node node = new Node(val,n);
            temp.next=node;
            node.next= temp.next.next;
            return;
        }
        temp= temp.next;
        insertRec(val,position-1);
    }
    public Node findVal(int value){
        Node node = head;
        while (node!=null){
            if(node.val==value){
                return node;
            }
            node= node.next;
        }
    return null;}
}
