package leetcode;

import static sun.swing.MenuItemLayoutHelper.max;

public class ReduceXToZero {
    public static void main(String[] args)
    {
       int[] num = {1,1,4,2,3};
        minOperations( num,5 );
    }

    public static int minOperations(int[] nums, int x) {
        int sum = 0, n = nums.length;
        for (int i : nums){
            sum = sum + i;
        }
        int target = sum - x;
        int currSum = 0, maxLen = 0;
        int i = 0;
        boolean found = false;
        for (int j = 0; j < n; j++){
            currSum = currSum + nums[j];
            while (i <= j && currSum > target){
                currSum = currSum - nums[i];
                i = i + 1;
            }
            if (currSum == target){
                found = true;
                maxLen= max(maxLen, j - i + 1);
            }
        }
        return found ? n - maxLen : -1;
    }
}
