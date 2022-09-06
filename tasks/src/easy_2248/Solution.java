package easy_2248;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        int arraysSize = nums.length;

        int size = nums[0].length;
        int[] arr = new int[size];

        int curLen = arr.length; // индекс массива, равен количеству оставшихся элементов

        System.arraycopy(nums[0], 0, arr, 0 , size);

        for(int i = 1; i < arraysSize; i ++){
            int[] curArr = nums[i];

            int j = 0;
            while(true){
                if(!isPresent(arr[j], curArr)){
                    arr[j] = arr[curLen-1];
                    curLen--;
                } else {
                    j++;
                }
                if(j >= curLen){
                    break;
                }
            }

            if(curLen == 0){
                break;
            }
        }

        Arrays.sort(arr, 0 , curLen);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < curLen; i++){
            list.add(arr[i]);
        }
        return list;
    }

    public static boolean isPresent(int a, int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(a == arr[i]) return true;
        }
        return false;
    }
}