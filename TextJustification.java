import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        ArrayList<String> result = new ArrayList<>();
        int index = 0;
        int last = 0;
        while(index < n) {
            StringBuilder resultItem = new StringBuilder();
            int totalChar = words[index].length();
            last = index + 1;
            while(last < n && (totalChar + 1 + words[last].length()) <= maxWidth) {
                totalChar += (1 + words[last].length());
                last++;
            }

            int gaps = last - index - 1;
            if(gaps == 0 || last == n) {
                for (int i = index; i < last; i++) {
                    resultItem.append(words[i]);
                    resultItem.append(" ");
                }
                resultItem.delete(resultItem.length() - 1, resultItem.length());
                for (int i = 0; i < maxWidth - totalChar; i++) {
                    resultItem.append(" ");
                }
            } else {
                int spaces = (maxWidth - totalChar) / gaps;
                int extra = (maxWidth - totalChar) % gaps;
                for(int i = index; i < last - 1; i++) {
                    resultItem.append(words[i]);
                    resultItem.append(" ");
                    for (int j = 0; j < spaces + ((i - index) < extra ? 1 : 0) ; j++) {
                        resultItem.append(" ");
                    }
                }
                resultItem.append(words[last - 1]);
            }
            result.add(resultItem.toString());
            index = last;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = fullJustify(words, maxWidth);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
