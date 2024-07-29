import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int value = 0;
        int previous = 0;
        int ans = 0;
        char[] charArrays = s.toCharArray();
        for(int i = charArrays.length - 1; i >= 0; i--) {
            switch (charArrays[i]) {
                case 'M' : value = 1000; break;
                case 'D' : value = 500; break;
                case 'C' : value = 100; break;
                case 'L' : value = 50; break;
                case 'X' : value = 10; break;
                case 'V' : value = 5; break;
                case 'I' : value = 1; break;
            }

            if(value >= previous)
                ans += value;
            else
                ans -= value;
            previous = value;
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
