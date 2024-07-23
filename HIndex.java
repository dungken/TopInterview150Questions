import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        // Sap xep mang tang dan
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            // Tim so bai bao ma so luong trich dan >= so luong trich dan hien tai dang xet
            int currentNumberOfPaper = n - i;
            if(citations[i] >= currentNumberOfPaper)
                return currentNumberOfPaper;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] citations = {3, 1, 0, 6, 5};
        System.out.println(hIndex(citations));
    }
}
