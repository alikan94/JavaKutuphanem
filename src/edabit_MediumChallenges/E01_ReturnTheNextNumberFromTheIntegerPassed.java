package edabit_MediumChallenges;

public class E01_ReturnTheNextNumberFromTheIntegerPassed {
    public static void main(String[] args) {
        /*
        Create a function that takes a number as an argument, increments the number by +1 and returns the result.

        Examples
        addition(0) ➞ 1

        addition(9) ➞ 10

        addition(-3) ➞ -2
         */
        System.out.println(addition(5));

    }

    public static int addition(int num) {

        return num+1;
    }
}
