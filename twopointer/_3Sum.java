package twopointer;

import java.util.*;

public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            int currVal = nums[i];
            while(j < k) {
                if(currVal + nums[j] + nums[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(currVal);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    int temp = nums[j];
                    while(j < k && nums[j] == temp) {
                        ++j;
                    }
                    temp = nums[k];
                    while(k > j && nums[k] == temp) {
                        --k;
                    }
                } else if(currVal + nums[j] + nums[k] > 0) {
                    --k;
                } else {
                    ++j;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
