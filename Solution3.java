//Twosum problem
//Solution with time complexity O(n^2)

import java.util.Arrays;

public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    result[0] = i;
                    result[1] = j;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution3 sln = new Solution3();
        int[] inputArray = new int[args.length - 1];

        for (int i = 0; i < args.length-1; i++) {
            inputArray[i] = Integer.parseInt(args[i]);
        }

        int[] result = sln.twoSum(inputArray, Integer.parseInt(args[args.length-1]));
        System.out.println(Arrays.toString(result));
    }
}
