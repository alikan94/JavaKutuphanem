package edabit_HardChallenges;

import java.util.Arrays;

public class E04_LargestGap {
    public static void main(String[] args) {
        /*
        Given an array of integers, return the largest gap between the sorted elements of the array.

        For example, consider the array:

        [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
        ... in which, after sorting, the array becomes:

        [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
        ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

Examples
largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
// Largest gap between 9 and 20 is 11

largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
// After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
// Largest gap between 7 and 11 is 4

largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
// After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
// Largest gap between 6 and 8 is 2
         */
int[] arr1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
largestGap(arr1);
        System.out.println(largestGap(arr1));

    }

    public static int largestGap(int[] numbers) {

        int largestGap = 0;
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++) {
            if (largestGap<(numbers[i]-numbers[i-1])){
                largestGap=numbers[i]-numbers[i-1];
            }
        }

        return largestGap;
    }
}
