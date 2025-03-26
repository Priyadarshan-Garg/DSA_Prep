package Single;//import static com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM.traverse;

public class Main {
    public static void main(String[] args) {
        SinglyList head = new SinglyList();
        head.insertFirst(3);
        head.insertFirst(4);
        head.insertFirst(5);
        head.insertFirst(6);
        head.insertLast(7);
//        head.insertAtRandom(8,3);
        head.Display();
//        System.out.println(head.deleteAtRandom(2));
        head.insertRec(9,3);
        head.Display();
        System.out.println();
    }
}
