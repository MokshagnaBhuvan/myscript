//Greatest Common Divisor of Strings
//Time-Complexity --> O(n^2)
//Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
// Example 3:

// Input: str1 = "LEET", str2 = "CODE"
// Output: ""

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();
        String str4 = "";
        int i;

        if (size1 >= size2) {
            for (i = size2; i > 0; i--) {
                String str3 = str1.substring(0, i);
                if (size1 % i == 0 && size2 % i == 0) {
                    if (str1.equals(str3.repeat(size1 / i)) && str2.equals(str3.repeat(size2 / i))) {
                        str4 = str3;
                        break;
                    }
                }
            }
        } else {
            for (i = size1; i > 0; i--) {
                String str3 = str2.substring(0, i);
                if (size1 % i == 0 && size2 % i == 0) {
                    if (str2.equals(str3.repeat(size2 / i)) && str1.equals(str3.repeat(size1 / i))) {
                        str4 = str3;
                        break;
                    }
                }
            }
        }

        return str4;
    }
}
