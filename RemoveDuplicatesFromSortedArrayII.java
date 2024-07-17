public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int curr = 2;
        int prev = 1;
        while(curr < n) {
            if(nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
                ++curr;
            } else {
                ++prev;
                nums[prev] = nums[curr];
                ++curr;
            }
        }
        return prev + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3}; // 0 0 1 1 2 3 3
        System.out.println(removeDuplicates(nums));
    }
}
