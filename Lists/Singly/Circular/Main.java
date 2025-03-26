package Circular;

public class Main {
    public static void main(String[] args) {
        CircularList head = new CircularList();
        head.insert(3);
        head.insert(6);
        head.insert(2);
        head.insert(1);
        head.insert(8);
        head.displaly();
        System.out.println();
        head.deletion(8);
        head.displaly();
    }
}
