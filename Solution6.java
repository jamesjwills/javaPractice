public class Solution6 {

    StringBuilder longestCommonPrefix = new StringBuilder();

    public String longestCommonPrefix(String[] strs) {

            for (int i = 0; i < strs[0].length(); i++) {

                char currentCharacter = strs[0].charAt(i);

                for (int j = 1; j < strs.length ; j++) {

                    if (i > strs[j].length()-1 || currentCharacter != strs[j].charAt(i)) {
                        return longestCommonPrefix.toString();
                    }
                }

                longestCommonPrefix.append(currentCharacter);

            }
        

        return longestCommonPrefix.toString();

    }

    public static void main(String[] args) {
        Solution6 sln = new Solution6();
        String result = sln.longestCommonPrefix(args);
        System.out.println(result);
    }
}
