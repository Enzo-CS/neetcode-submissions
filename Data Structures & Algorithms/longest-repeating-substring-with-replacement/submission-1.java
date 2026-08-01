class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            
            char mostFrequent = 'A';
            for (char c = 'A'; c <= 'Z'; c++) {
                if (map.getOrDefault(c, 0) > map.getOrDefault(mostFrequent, 0)) {
                    mostFrequent = c;
                }
            }

            while ((right - left + 1) - map.get(mostFrequent) > k) {
                map.put(s.charAt(left), map.get(s.charAt(left++)) - 1);
                for (char c = 'A'; c <= 'Z'; c++) {
                    if (map.getOrDefault(c, 0) > map.getOrDefault(mostFrequent, 0)) {
                        mostFrequent = c;
                    }
                }
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}