public class TrappingRainWater {
    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];

        int ans = 0;
        while(l < r) {
            if(leftMax < rightMax) {
                l++;
                if(leftMax < height[l]) {
                    leftMax = height[l];
                } else {
                    ans += leftMax - height[l];
                }
            } else { // leftMax >= rightMax
                r--;
                if(rightMax < height[r]) {
                    rightMax = height[r];
                } else {
                    ans += rightMax - height[r];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

}
