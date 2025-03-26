public class Number_of_digits {
    public static void main(String[] args) {
        int n =23;
        int ans = (int)((Math.log(n)/Math.log(10))+1);
        System.out.println(ans);
    }
}
