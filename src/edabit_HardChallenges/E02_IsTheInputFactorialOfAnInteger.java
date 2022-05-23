package edabit_HardChallenges;

public class E02_IsTheInputFactorialOfAnInteger {

    /*
    Create a function that checks if a given integer is exactly the factorial of an integer or not.
    true if it is, false otherwise.

    Examples
            isFactorial(2) ➞ true
            // 2 = 2 * 1 = 2!
            isFactorial(27) ➞ false
            isFactorial(24) ➞ true
            // 24 = 4 * 3 * 2 * 1 = 4!
    Notes

    No error handling is necessary. Inputs are all positive integers.
    Alternatively, you can solve this with a recursive approach.
     */

    public static void main(String[] args) {
        System.out.println(isFactorial2(2));
        System.out.println(isFactorial2(15));
        System.out.println(isFactorial2(20));
        System.out.println(isFactorial2(24));
        System.out.println(isFactorial2(72));
        System.out.println(isFactorial2(720));
    }
    public static boolean isFactorial(int n) {

        int result = 1;
        boolean isFactorial = false;

        for (int i = 1; i <= n; i++) {
            if (result!=n){
                result*=i;
            }
            if (result==n){
                isFactorial=true;
            }
        }

        return isFactorial;
    }

    public static boolean isFactorial2(int n) {

        int result = 1;
        for (int i = 1; result < n; i++) {
           result*=i;
        }
        return n==result;
    }
}
