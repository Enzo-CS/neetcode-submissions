class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder("");
        
        for (String str: strs) {
            encodedString.append(String.format("%d#%s", str.length() ,str));
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> listOfStrings = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            StringBuilder lengthInStr = new StringBuilder("");

            while (str.charAt(i) != '#') {
                lengthInStr.append(str.charAt(i++));
            }
            
            int length = Integer.parseInt(lengthInStr.toString());
            
            StringBuilder word = new StringBuilder("");
            for (int c = 0; c < length; c++) {
                word.append(str.charAt(++i));
            } 

            listOfStrings.add(word.toString());
            i++;
        }

        return listOfStrings;
    }
}
