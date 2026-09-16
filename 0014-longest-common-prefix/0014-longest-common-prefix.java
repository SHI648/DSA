public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is null or empty, return ""
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string in the array
        String prefix = strs[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until the current string starts with it
            // indexOf returns 0 if 'prefix' is at the very start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix is reduced to empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}