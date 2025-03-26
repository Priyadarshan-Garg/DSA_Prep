public class Odd_Even {
    public static void main(String[] args) {
        System.out.println(oddEven(5));
    }

    private static boolean oddEven(int n) {
        return (n & 1)==1;
    }
}