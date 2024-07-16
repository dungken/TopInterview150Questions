public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
