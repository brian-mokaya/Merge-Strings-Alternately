class MergeStrings {
    public String mergeStringAternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}

public class Merge {
    public static void main(String[] args) {
        MergeStrings mergeStrings = new MergeStrings();
        String word1 = "mokaya";
        String word2 = "brian";
        String result = mergeStrings.mergeStringAternately(word1, word2);
        System.out.println(result);
    }
}
