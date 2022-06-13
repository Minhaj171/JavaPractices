package leetcode;

import java.util.Scanner;

public class Solution1_Intermediate_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        rotate(nums, 2);
    }

    public static void rotate(int[] num, int k){
        if (k > num.length)
            k = k % num.length;

        int [] result = new int[num.length];

        for (int i = 0; i < k; i++){
            result[i] = num[num.length-k+i];
        }

        int j = 0;
        for (int i = k; i < num.length; i++){
            result[i] = num[j];
            j++;
        }

        System.arraycopy(result, 0, num, 0, num.length);

        for (int num1: num){
            System.out.println(num1);
        }
    }


}
