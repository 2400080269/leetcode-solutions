class Solution {
    public int romanToInt(String s) {
               int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));

            if (i + 1 < s.length() && curr < value(s.charAt(i + 1))) {
                res -= curr;
            } else {
                res += curr;
            }
        }

        return res;
    }

    public int value(char roman) {
        if (roman == 'I') return 1;
        if (roman == 'V') return 5;
        if (roman == 'X') return 10;
        if (roman == 'L') return 50;
        if (roman == 'C') return 100;
        if (roman == 'D') return 500;
        return 1000;
    }
}
        
