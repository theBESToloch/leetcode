package easy_1941;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] mas = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            mas[s.charAt(i)-97]++;
        }
        int count = mas[s.charAt(0)-97];
        for(int i = 0; i < 26; i ++){
            if(mas[i] > 0 && count != mas[i]) return false;
        }
        return true;
    }
}