public class Comparison {
    public static void main(String[] args) {
        int a =10;
        int b =10;
        String k ="P";
        String l ="P";
        // System.out.println(a==b); //yaha agar done ek hi object ko point kar rhe honge heap me to true aayega
       // System.out.println(k==l); //yaha agar done ek hi object ko point kar rhe honge to true aayega
        String h =new String("P");
        System.out.println(h==k); // yha false ayega kyuki ye alag object ko point kr rhaa h
        System.out.println(h.equals(k)); // yaha object se mtlb nahi hai sirf value se to idhar true hoga
        
    }
}
