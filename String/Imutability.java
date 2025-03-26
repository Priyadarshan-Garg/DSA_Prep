public class Imutability {
    public static void main(String[] args) {
        String P1 ="PD";
        String P2 ="PD";
        String P3 ="PD";
        String P4 ="PD";
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        System.out.println(P4);
        P1="P";
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        System.out.println(P4);
    }
}
