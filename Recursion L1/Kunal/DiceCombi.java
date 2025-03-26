package Kunal;

public class DiceCombi {
    public static void main(String[] args) {
        dice("",5);
    }

    static void dice (String changed,int target){
        if(target==0){
            System.out.println(changed);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(changed+i,target-i);
        }
    }
}
