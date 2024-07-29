import java.util.ArrayList;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if(numRows == 1 || s.length() < numRows)
            return s;
        ArrayList<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new ArrayList<>();
        }
        int index = 0;
        int d = 1;
        for(Character c : s.toCharArray()) {
            rows[index].add(c);
            if(index == 0) {
                d = 1;
            } else if(index == numRows - 1) {
                d = -1;
            }
            index += d;
        }
        StringBuilder result = new StringBuilder();
        for (ArrayList<Character> row : rows) {
            for(Character c : row) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "ABC";
        int numRows = 1;
        System.out.println(convert(s, numRows));
    }
}
