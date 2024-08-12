package arraystring;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String[] sysbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        StringBuilder result = new StringBuilder();
        while(num > 0) {
            if(num >= values[i]) {
                result.append(sysbols[i]);
                num -= values[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }
}
