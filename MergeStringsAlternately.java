// "You are given two strings  and . Merge the strings by adding letters in alternating order, starting with .

// If a string is longer than the other, append the additional letters onto the end of the merged string.

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s"




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