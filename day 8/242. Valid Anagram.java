import java.util.Arrays;

public class Solution {
    
    public boolean isAnagram(String str1, String str2) {
       
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();  

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        
        return Arrays.equals(str1CharArray, str2CharArray);
    }

    public static void main(String[] args) {
        String param_1 = "earth";
        String param_2 = "heart";

        boolean ret = new Solution().isAnagram(param_1, param_2);

        if (ret) {
            System.out.println(param_1 + " and " + param_2 + " are anagrams of each other.");
        } else {
            System.out.println(param_1 + " and " + param_2 + " are not anagrams of each other.");
        }
    }
}
