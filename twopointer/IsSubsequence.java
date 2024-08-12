package twopointer;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int ns = s.length(), nt = t.length();
        int i = 0, j = 0, cnt = 0;
        while(i < ns && j < nt) {
            if(s.charAt(i) == t.charAt(j)) {
                ++cnt;
                i++;
                j++;
            }
            while(i < ns && j < nt && s.charAt(i) != t.charAt(j)) {
                ++j;
            }
        }
        return cnt == ns;
    }
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
