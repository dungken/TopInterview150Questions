public class MergeSortedArray {
    public static void merge(int[] a, int m, int[] b, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 || j >= 0) {
            if(i >= 0 && j >= 0) { // TH: i >= 0 && j >= 0
                if(a[i] >= b[j]) {
                    a[k--] = a[i--];
                } else {
                    a[k--] = b[j--];
                }
            } else if(i >= 0) { // TH: i >= 0
                a[k--] = a[i--];
            } else { // TH: j >= 0
                a[k--] = b[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0,0};
        int m = 3;
        int[] b = {2, 5, 6, 9};
        int n = 4;
        merge(a, m, b, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
