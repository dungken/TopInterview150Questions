package twopointer;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] ans = new int[2];
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum < target) {
                ans[0] = left;
                ++left;
            } else if(sum > target) {
                ans[1] = right;
                --right;
            } else {
                break;
            }
        }
        if(left < right) {
            ans[0] = left + 1;
            ans[1] = right + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
