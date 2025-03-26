public class Split_Arr_Min {
    public static void main(String[] args) {
        int [] arr ={7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(arr,k));
    }
    static int splitArray(int[] nums, int m) {
        // Initialize the binary search boundaries
        int left = getMax(nums); // The maximum single element is the lower bound
        int right = getSum(nums); // The sum of all elements is the upper bound

        // Perform binary search to find the minimum possible largest sum
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If we can split into m parts with largest sum <= mid
            if (canSplit(nums, m, mid)) {
                right = mid; // Try to lower the mid value
            } else {
                left = mid + 1; // Increase the mid value
            }
        }

        return left;
    }

    // Function to check if we can split the array into m parts with max sum <= target
    static boolean canSplit(int[] nums, int m, int target) {
        int currentSum = 0;
        int count = 1; // At least one subarray

        for (int num : nums) {
            currentSum += num;

            // If current sum exceeds the target, start a new subarray
            if (currentSum > target) {
                count++;
                currentSum = num; // Start the new subarray with the current number
            }

            if (count > m) {
                return false; // More subarrays than allowed
            }
        }

        return true;
    }

    // Helper function to find the maximum element in the array
    static int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Helper function to get the sum of the array
    static int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}

