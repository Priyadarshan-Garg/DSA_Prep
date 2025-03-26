public class Pattern2 {
    public static void main(String[] args) {
        for (int row = 1; row < 6; row++) {
            for (int col = row; col <6 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
