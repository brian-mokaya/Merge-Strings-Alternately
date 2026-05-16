class MergeStrings{

    public String mergeStringsAlternately(String word1, String word2){

        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i<word1.length() && j<word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        while (i<word1.length()) result.append(word1.charAt(i++));
        while (j<word2.length()) result.append(word2.charAt(j++));
        
     return result.toString();
    }
}

public class MergeStringsAlternately{
    public static void main(String[] args) {
        MergeStrings mergeStrings = new MergeStrings();
        String word1 = "mokaya";
        String word2 = "brian";
        String result = mergeStrings.mergeStringsAlternately(word1, word2);
        System.out.println(result);
    }
}