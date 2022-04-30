package edabit_MediumChallenges;

public class WarOfNumbers {
    public static void main(String[] args) {
        //There's a great war between the even and odd numbers.
        // Many numbers already lost their lives in this war and it's your task to end this.
        // You have to determine which group sums larger: the evens, or the odds. The larger group wins.
        //
        //Create a function that takes an array of integers,
        // sums the even and odd numbers separately,
        // then returns the difference between the sum of the even and odd numbers.
        //Examples
        //
        //warOfNumbers([2, 8, 7, 5]) ➞ 2
        //// 2 + 8 = 10
        //// 7 + 5 = 12
        //// 12 is larger than 10
        //// So we return 12 - 10 = 2
        //
        //warOfNumbers([12, 90, 75]) ➞ 27
        //
        //warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
        //

        int[]numbers = {2, 8, 7, 5};
        int[]numbers2 = {12, 90, 75};
        int[]numbers3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(numbers));
        System.out.println(warOfNumbers(numbers2));
        System.out.println(warOfNumbers(numbers3));

    }

    public static int warOfNumbers(int[]numbers){

        int sonuc = 0;
        int sumOfEvens=0;
        int sumOfOdds=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                sumOfEvens+=numbers[i];
            } else {
                sumOfOdds+=numbers[i];
            }
        }
        sonuc=sumOfEvens-sumOfOdds;
        if (sonuc<0){
            sonuc*=(-1);
        }
        return sonuc;
    }
}
