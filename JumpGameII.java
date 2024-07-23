public class JumpGameII {
    public static int jump(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int res = 0;
        while(r < n - 1) {
            int f = 0;
            // Tim buoc nhay xa nhat trong doan [l, r]
            for(int index = l; index <= r; index++) {
                if((index + nums[index]) > f)
                    f = index + nums[index];
            }
            l = r + 1;
            r = f;
            ++res;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
