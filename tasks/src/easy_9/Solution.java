package easy_9;

class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0) return false;
        String val = String.valueOf(x);
        int len = val.length();
        int halfLen = len/2;
        for(int i = 0; i < halfLen; i++){
            if(val.charAt(i) != val.charAt(len-1-i)) return false;
        }
        return true;
    }
}