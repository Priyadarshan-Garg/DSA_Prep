package REC_Pattern;

public class Rec_downTriangle {

    static void P(int row , int col){
        if(row ==0){
            return;
        }

        if(row>col){
            System.out.print("* ");
            P(row,col+1);
        }

        else{
            System.out.println();
            P(row-1,0);
        }
    }
    public static void main(String[] args) {
        P(4,0);
    }
}
