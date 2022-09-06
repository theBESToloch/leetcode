package easy_2027;

class Solution {
    public int minimumMoves(String s) {
        int acc = 0;
        int len = s.length();

        int i = 0;
        while(i < len){
            char a = s.charAt(i);
            if(a == 'X'){
                i+=3;
                acc++;
            } else {
                i++;
            }
        }
        return acc;
    }
}