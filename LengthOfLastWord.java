public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int ans = 0;
        while(s.charAt(index) == ' ') {
            index--;
        }
        while(index >= 0 && s.charAt(index) != ' ') {
            ans++;
            index--;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "s";
        System.out.println(lengthOfLastWord(s));
    }
}
