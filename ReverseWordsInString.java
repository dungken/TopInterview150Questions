public class ReverseWordsInString {
    public static String reverseWords(String s) {
        char[] charArrays = s.toCharArray();
        char[] ans = new char[s.length()];
        int index = 0;
        int end = 0;
        for(int i = charArrays.length - 1; i >= 0; i--) {
            if(charArrays[i] != ' ') {
                end = i;
                while(i >= 0 && charArrays[i] != ' ') {
                    i--;
                }
                if(index != 0) {
                    ans[index] = ' ';
                    index++;
                }
                for (int j = i + 1; j <= end; j++) {
                    ans[index] = charArrays[j];
                    index++;
                }
            }
        }
        return new String(ans, 0, index);
    }
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
