package L1;//Print numbers 1 to N
//(Input: N, Output: 1 2 3 ... N using recursion)

public class Print_numbers {
    public static void main(String[] args) {
        printNum(7);
    }
    public static void printNum(int N){
        if(N>1){
            printNum(N - 1);
        }
        System.out.println(N);
    }
}
