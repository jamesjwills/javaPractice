// maybe try reading the string backwards

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Solution5 {

    
    public int romanToInt(String s) {
        
        int result = 0;

        char[] charArray = new char[2];

        Map<Character, Integer> letterValues = new HashMap<>();
    
        letterValues.put('I', 1);
        letterValues.put('V', 5);
        letterValues.put('X', 10);
        letterValues.put('L', 50);
        letterValues.put('C', 100);
        letterValues.put('D', 500);
        letterValues.put('M', 1000);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("IV");
        stringSet.add("IX");
        stringSet.add("XL");
        stringSet.add("XC");
        stringSet.add("CD");
        stringSet.add("CM");

        for (int i = 0; i < s.length(); i++) {
            // reset char array

            charArray[0] = charArray[1];
            charArray[1] = s.charAt(i);

            String charArrayAsString = new String(charArray);

            result += letterValues.get(s.charAt(i));
            if (stringSet.contains(charArrayAsString)) {
                result -= 2*letterValues.get(charArray[0]);
            }

        }
        return result;
    }


    public static void main(String[] args) {
        Solution5 sln = new Solution5();
        int answer = sln.romanToInt(args[0]);
        System.out.println(answer);
    }
    
}
// MCMXCIV