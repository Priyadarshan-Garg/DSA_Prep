import java.util.HashSet;
import java.util.Set;

class findKthPositive {

        public int Function(int[] arr, int k) {
            int missingCount = 0, index = 0, num = 1;

            while (missingCount < k) {
                if (index < arr.length && arr[index] == num) {
                    index++;    // ignore kar do
                } else {
                    missingCount++; //
                    if (missingCount == k) return num; // pakad me aagya return kar do
                }
                num++;
            }

            return -1;
        }
    }


    //The above solution is correct but we can improve it by using HashSet to store all the numbers in the array first and then start from 1 and for each number we check if it is present in the set or not. If the number is not present then we increment the count and if the count is equal to k then we return that number. This way we don't have to traverse the array twice.
