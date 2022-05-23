package edabit_HardChallenges;

import java.util.Arrays;

public class C03_ConsecutiveNumbers {
    /*
    Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
        Examples

        cons([5, 1, 4, 3, 2]) ➞ true
        // Can be re-arranged to form [1, 2, 3, 4, 5]
        cons([5, 1, 4, 3, 2, 8]) ➞ false
        cons([5, 6, 7, 8, 9, 9]) ➞ false
        // 9 appears twice
     */
    public static void main(String[] args) {

        int[] arr1= {5, 1, 4, 3, 2};
        int[] arr2= {5, 1, 4, 3, 2, 8};
        int[] arr3= {5, 6, 7, 8, 9, 9};
        System.out.println(cons(arr1));
        System.out.println(cons(arr2));
        System.out.println(cons(arr3));
    }

    public static boolean cons(int[] arr) {

        boolean isCons = false;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i-1]+1)==arr[i]){
                isCons = true;
            } else {
                isCons = false;
                break;
            }
        }

        return isCons;
    }
}
