package arraystring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // Solution 1
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];
    }

    // Solution 2 Using HashMap
    public static int majorityElement2(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(Integer num : nums) {
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> map : myMap.entrySet()) {
            if(map.getValue() > n / 2)
                return map.getKey();
        }

        return 0;
    }

    // Solution 3
    public static int majorityElement3(int[] nums) {
        int lead = 0;
        int count = 0;
        for(Integer element : nums) {
            if(count == 0) {
                lead = element;
            }
            if(lead == element) {
                ++count;
            } else {
                --count;
            }
        }
        return lead;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement3(nums));
        System.out.println(majorityElement3(nums2));
    }
}
