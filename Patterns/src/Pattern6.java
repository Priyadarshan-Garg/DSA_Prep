public class Pattern6 {
    public static void main(String[] args) {
        for (int row = 1; row < 6; row++) {
            for (int col = 1; col <=2*row-1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
