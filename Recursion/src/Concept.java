public class Concept {
    public static void main(String[] args) {
        Con(9);
    } static void Con(int m){
        if(m==0){
            return ;
        }
        System.out.println(m);
//        Con(m--);
        // infinite function calling first fun is called with value m when its going to then its gonna decrement
        Con(--m); // first dec then fun is called
    }
}
