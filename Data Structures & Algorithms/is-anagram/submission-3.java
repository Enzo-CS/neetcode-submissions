class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        List<Integer> ascii = new ArrayList<>();

        // Decoding from char -> ascii (97-122)
        for (int i=0; i<s.length(); i++) {
            ascii.add((int) s.charAt(i));
        }

        for (int i=0; i<s.length(); i++) {
            int cur = (int) t.charAt(i);
            if (ascii.contains(cur)) ascii.remove(Integer.valueOf(cur));
        }

        if (ascii.isEmpty()) return true;
        else return false;
    }
}
