package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        int wordLen = words[0].length();
        if(wordLen * words.length > s.length())
            return new ArrayList<>();
        HashMap<String, Integer> wordsFreq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(String word : words) {
            wordsFreq.put(word, wordsFreq.getOrDefault(word, 1) + 1);
        }
        String[] window = new String[s.length()];
        for (int i = 0; i < wordLen; i++) {
            int size = 0;
            int begin = i;
            HashMap<String, Integer> freq = new HashMap<>();
            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
                window[j] = s.substring(j, j + wordLen);
                if(wordsFreq.containsKey(window[j])) {
                    freq.put(window[j], freq.getOrDefault(window[j], 1) + 1);
                    begin = begin == -1 ? j : begin;
                    size++;
                    if(size == words.length) {
                        if(freq.equals(wordsFreq)) {
                            result.add(begin);
                        }
                        freq.put(window[begin], freq.get(window[begin]) - 1);
                        begin += wordLen;
                        size--;
                    }
                } else {
                    begin = -1;
                    size = 0;
                    freq.clear();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        System.out.println(findSubstring(s, words));
    }
}
