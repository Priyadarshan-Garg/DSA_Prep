public class Linear_search_byKunal {
    public static void main(String[] args) {
        int[] srr = {1,31,-24,253,-4243,-234,124,21};
        int target =1;
        int ans = Linear_search(srr,target);
        System.out.println(ans);
    }
    static int Linear_search (int[]arr, int Target){

        if(arr== null){
            return -1;
        }
        for(int Index=0; Index <arr.length; Index++){
            if(arr[Index]== Target){
                return Target;
            }
        }
        // YEH NICHE WALA STATEMENT TAB CHALEGA JB UPAR WALE NAHI CHALENGE
        // Smae chij hum true false me kr skte hai bs -1-->false and Target--> True me change kar do

    return -1;}
}
