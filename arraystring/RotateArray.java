package arraystring;

public class RotateArray {
    // Solution 1
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Dam bao rang k < n
        int[] arrTemp = new int[n - k];
        for(int i = 0; i < n - k; i++) {
            arrTemp[i] = nums[i];
        }

        //
        for(int i = 0; i < n; i++) {
            if(i < k) {
                nums[i] = nums[i + (n - k)];
            } else {
                nums[i] = arrTemp[i - k];
            }
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            ++start;
            --end;
        }
    }

    // Solution 2
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1); // Xoay toan bo mang ban dau
        reverse(nums, 0, k - 1); // Xoay mag tu vi tri dau tien den vi tri k - 1
        reverse(nums, k, n - 1); // Xoay mang tu vi tri k den cuoi cung
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        int k1 = 3, k2 = 2;
        rotate2(nums1, k1); // 5 6 7 1 2 3 4
        rotate2(nums2, k2); // 3 99 -1 -100
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
