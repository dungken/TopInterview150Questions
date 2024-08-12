package arraystring;

import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int[] ans = new int[ratings.length];
        Arrays.fill(ans, 1);
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1])
                ans[i] = ans[i - 1] + 1;
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1])
                ans[i] = Math.max(ans[i + 1] + 1, ans[i]);
        }
        int result = 0;
        for (int i = 0; i < ans.length; i++) {
            result += ans[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] ratings = {1, 3, 4, 5, 2, 1};
        System.out.println(candy(ratings));
    }
}
