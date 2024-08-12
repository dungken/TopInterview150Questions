package slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            if(!map.containsKey(s.charAt(right)) || map.get(s.charAt(right)) < left) {
                map.put(s.charAt(right), right);
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
