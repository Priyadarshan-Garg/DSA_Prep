package REC_Easy;

public class Return_type_void {
    public static void main(String[] args) {
//        Fun(5);
        FunRev(5);
    } static void Fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Fun(n-1);
    }
    static void FunRev(int n){
        if(n==0){
            return;
        }
        FunRev(n-1);
        System.out.println(n);
    }
}
