package REC_Pattern;

public class UP_Triangle {
    static void P(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            P(r,c+1);
            System.out.print("* ");
        } else {
            P(r-1,0);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        P(4,0);
    }
}
