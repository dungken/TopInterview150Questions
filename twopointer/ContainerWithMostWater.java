package twopointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while(left < right) {
            int len = Math.min(height[left], height[right]);
            int base = right - left;
            maxArea = Math.max(maxArea, len * base);
            while(left < right && height[left] <= len) {
                ++left;
            }
            while(left < right && height[right] <= len) {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
