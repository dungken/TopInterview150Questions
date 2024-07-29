import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int cnt = 1;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        for (int i = 0; i < nums.length; i++) {
            ans[i] *= cnt;
            cnt *= nums[i];
        }

        cnt = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= cnt;
            cnt *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
