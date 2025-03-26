public class Search_Strings {
    public static void main(String[] args) {
            String []srr= {"Priyadarshan","Ajay", "Amar","Linkin","Shonty","Babu Bhai"};
            String Target = "Linkin";
            String Target2 = "da";
        System.out.println(Strings_search(srr,Target2));
    }
    static boolean Strings_search(String[] arr, String Target){
        if(arr==null){
            return false;
        }
        for (int index =0; index< arr.length;index++){
            if(Target== arr[index]){
                return true;
            }

        }
   return false; }
}
