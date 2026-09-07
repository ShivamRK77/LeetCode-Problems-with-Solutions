import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] freq = new int[26];

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int count = p.length();

        for (int j = 0; j < s.length(); j++) {

            // Include s[j]
            if (freq[s.charAt(j) - 'a'] > 0) {
                count--;
            }

            freq[s.charAt(j) - 'a']--;

            // Window becomes larger than p
            if (j - i + 1 > p.length()) {

                if (freq[s.charAt(i) - 'a'] >= 0) {
                    count++;
                }

                freq[s.charAt(i) - 'a']++;
                i++;
            }

            // Anagram found
            if (count == 0) {
                result.add(i);
            }
        }

        return result;
    }
}