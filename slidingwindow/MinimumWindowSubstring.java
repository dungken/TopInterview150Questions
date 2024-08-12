package slidingwindow;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] freq = new int[128];
        int start = 0, end = 0, count = t.length(), minLen = Integer.MAX_VALUE, indexStart = 0;
        for(char c : tArr) {
            freq[c]++;
        }
        while(end < sArr.length) {
            if(freq[sArr[end++]]-- > 0) {
                count--;
            }
            while(count == 0) {
                if(end - start < minLen) {
                    minLen = end - start;
                    indexStart = start;
                }
                if(freq[sArr[start++]]++ == 0) {
                    count++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(indexStart, indexStart + minLen);
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
