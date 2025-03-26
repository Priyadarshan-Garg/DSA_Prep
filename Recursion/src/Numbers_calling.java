public class Numbers_calling {
    public static void main(String[] args) {
            Print(1);
    }

    private static void Print(int n ) {
//        int i =5;
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        Print(n+1);

    }
}