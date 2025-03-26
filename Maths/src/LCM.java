public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,2,hcf(3,2)));
    }
    static int lcm(int a,int b, int c){
        return a*b/c;
    }
    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}
