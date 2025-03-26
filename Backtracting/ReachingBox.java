import java.util.ArrayList;
import java.util.List;

public class ReachingBox {

    public static void main(String[] args) {

//        System.out.println(count(3,3));
//        System.out.println(WithDiagonal("",3,3));

        boolean[] [] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        AllPath("",arr,0,0);

    }
//    public static int count =0;
//    public static int m;
//    public static int n;
//    static <arr> int box(int [m] [n] arr){
//        // we have to reach 1,1;
//        if(box(arr[1][]) || box(arr[][1]) ){
//            return count;
//        }
//
//    }

    // ese nhi karna hai

    public static int count(int row ,int col){
        if (row == 1 && col==1) {
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);
    return left+right;
    }


    public static ArrayList<String> Lis(String L, int row , int col){
        if (row == 1 && col==1) {
            ArrayList<String> S = new ArrayList<>();
            S.add(L);
            return S;
        }
        ArrayList<String> left = new ArrayList<>();
        if(row>1){
            left =Lis(L+"D",row-1,col);
        }
        ArrayList<String> right = new ArrayList<>();
        if(col>1){
            right=Lis(L+"R",row,col-1);
        }
        left.addAll(right);
        return left;
    }



    public static ArrayList<String> WithDiagonal(String L, int row , int col){
        if (row == 1 && col==1) {
            ArrayList<String> S = new ArrayList<>();
            S.add(L);
            return S;
        }
        ArrayList<String> left = new ArrayList<>();
        if(row>1){
            left =WithDiagonal(L+"Down.",row-1,col);
        }
        ArrayList<String> right = new ArrayList<>();
        if(col>1){
            right=WithDiagonal(L+"Right.",row,col-1);
        }
        ArrayList<String> Dia = new ArrayList<>();
        if ( row> 1 && col>1) {
            Dia=WithDiagonal(L+"Di.",row-1,col-1);
        }
        left.addAll(right);
        left.addAll(Dia);
        return left;
    }
    static void AllPath(String p, boolean[][] maze,int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]= false;
        if(r>0){
            AllPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            AllPath(p+"L",maze,r,c-1);
        }
        if(r< maze.length-1){
            AllPath(p+"R",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            AllPath(p+"D",maze,r,c+1);
        }
    maze[r][c]=true;
    }

}
