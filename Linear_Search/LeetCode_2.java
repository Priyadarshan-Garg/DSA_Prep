public class LeetCode_2 {
    public static void main(String[] args) {
        int [][] arr = {
                {2,67,57},
                {2,5,75},
                {1,34,53},
        };
        System.out.println(Wealth(arr));

    }
    static int Wealth(int[][] arr){
        int person1 =0;
        int person2 =0;
        int person3 =0;
        for (int i =0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                person1=person1+ arr[i][j];
//         return person1;
            }
        }
        for (int i =1; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                person2+=arr[i][j];

            }
        }
        for (int i =2; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                person3+=arr[i][j];


            }
        }

    return person1;
    }
}
