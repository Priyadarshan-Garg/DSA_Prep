public class Function_Overloading {
    public static void main(String[] args) {
        Fun(76);
        Fun("Pd");
        // khud se name and a mat likh bas likh de ye khud assign kr dega according to data type
    }
    static void Fun(int a){
        System.out.println(a);
    }
    static void Fun(String Name){
        System.out.println(Name);
    }
}
