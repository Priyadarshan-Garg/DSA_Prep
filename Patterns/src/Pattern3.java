public class Pattern3 {
    public static void main(String[] args) {
        for (int row = 6; row >0 ; row--) {
            for (int col = 1; col <6-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
