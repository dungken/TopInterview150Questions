public class FindTheIndexTheFirstOccurrenceString {
    public static int strStr(String s1, String s2) {
        char firstCharS2 = s2.charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if(firstCharS2 == s1.charAt(i)) {
                if(s1.startsWith(s2, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(strStr(s1, s2));
    }
}
