package edabit_HardChallenges;

public class E07_DigitsSumRoot {
    // Create a function that takes a number and returns one digit that is the
    // result of summing all the digits of the input number.
    // When the sum of the digits consists of more than one digit,
    // repeat summing until you get one digit.
    //Examples
    //
    //digitRoot(123) ➞ 6
    //// 1 + 2 + 3 = 6
    //
    //digitRoot(999888777L) ➞ 9
    //
    //digitRoot(1238763636555555555L) ➞ 9
    //
    //Notes
    //
    //Recursion is allowed.

    public static void main(String[] args) {

        long[] numVector = new long[] {
                999888777, 1799877799877998777L, 9876546839792379L,
                1238763636555555555L, 1238222222222222226L, 3612376363612876636L, 0
        };
        int[] resVector = new int[] {9, 7, 3, 9, 3, 4, 0};


        long ilkSayi = 999888777;
        System.out.println(digitRoot(ilkSayi));

        for (long each : numVector) {
            System.out.println(digitRoot(each));
        }
    }



    public static int digitRoot(long n) {

        int sum = 0;
        long temp = n;

        if (temp >0 && temp <10){
            sum=(int) temp;
        } else if ( temp == 0){
            return sum;
        } else if (temp>10){
            sum = sumOfDigitsAboveTen(temp);
        }



        return sum;

    }

    private static int sumOfDigitsAboveTen(long temp) {
        int sum = 0;

        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }

        if (sum>10){
            sum=sumOfDigitsAboveTen(sum);
        }

        return sum;
    }
}
