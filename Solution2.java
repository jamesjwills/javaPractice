import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> counts = new HashMap<>();

        for (String s : words) {
            for (char c : s.toCharArray()) {
                int count = counts.getOrDefault(c, 0);
                counts.put(c, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % words.length != 0) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Solution2 sln = new Solution2();
        boolean result = sln.makeEqual(args);
        System.out.println(result);
    }
}
