class Solution {
    public boolean isPalindrome(String s) {
        
    int left = 0;
    int right = s.length() - 1;

    while(left <= right) {
        if(s.isAlphanumeric(left) != s.isAlphanumeric(right)){
            break;
        } 
        left++;
        right--;
    }
    return true;
}