public class Fibo_Formula {
    public static void main(String[] args) {
        System.out.println(fibo(1));
    } static double fibo(int n){
        double v =(1+Math.sqrt(5))/2;
        double x =(1-Math.sqrt(5))/2;
        double vn = Math.pow(v,n);
        double xn = Math.pow(x,n);
       return (int) (xn+vn)/Math.sqrt(5);
    }
}
