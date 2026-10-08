import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        // Convert int array to String array
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> {
            return (b + a).compareTo(a + b);
        });

        // Edge case: [0, 0, 0]
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the answer
        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}