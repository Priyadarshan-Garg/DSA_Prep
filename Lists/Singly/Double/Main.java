package Double;

public class Main {
    public static void main(String[] args) {
        DoublyList head = new DoublyList();
        head.insertFirst(3);
        head.insertFirst(4);
        head.insertFirst(6);
        head.insertFirst(7);
        head.Display();
        head.insertLast(8);
        head.insertAtRandom(2,2);
        head.Display();

    }
}
