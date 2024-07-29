import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // Sx strs theo thu tu tu dien
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        int index = 0;
        while(index < firstStr.length() && index < lastStr.length()) {
            if(firstStr.charAt(index) == lastStr.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return firstStr.substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
