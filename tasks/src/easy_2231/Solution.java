package easy_2231;

import java.util.Arrays;

class Solution {
    public int largestInteger(int num) {
        int size = 10;
        int[] arr = new int[size];

        int count = transformToArray(num, arr);

        int oddI = 0;
        int[] oddDigit = new int[size];
        int evenI = 0;
        int[] evenDigit = new int[size];

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                oddDigit[oddI] = arr[i];
                oddI++;
            } else {
                evenDigit[evenI] = arr[i];
                evenI++;
            }
        }

        Arrays.sort(oddDigit);
        Arrays.sort(evenDigit);

        oddI = size - 1;
        evenI = size - 1;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddDigit[oddI];
                oddI--;
            } else {
                arr[i] = evenDigit[evenI];
                evenI--;
            }
        }

        return transformToDigit(arr, count);
    }

    private int transformToDigit(int[] arr, int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc = acc * 10 + arr[i];
        }
        return acc;
    }

    private int transformToArray(int num, int[] arr) {
        int i = 0;
        int size = arr.length;
        while (num > 0) {
            arr[size - i - 1] = num % 10;
            num = num / 10;
            i++;
        }

        for (int j = 0; j < i; j++) {
            arr[j] = arr[size - i + j];
        }

        for (int j = i; j < size; j++) {
            arr[j] = 0;
        }

        return i;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int num = 65875;
        int i = s.largestInteger(num);
        System.out.println(i);

        int num1 = 1234;
        int i1 = s.largestInteger(num1);
        System.out.println(i1);

        int num2 = 1000000000;
        int i2 = s.largestInteger(num2);
        System.out.println(i2);
    }
}