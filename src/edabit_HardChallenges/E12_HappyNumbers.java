package edabit_HardChallenges;

public class E12_HappyNumbers {
    /*
    Given any number, we can create a new number by adding the sums of squares of digits of that number.
    For example, given 203, our new number is 4 + 0 + 9 = 13.
    If we repeat this process, we get a sequence of numbers:
        203 -> 13 -> 10 -> 1 -> 1
    Sometimes, like with 203, the sequence reaches (and stays at) 1.
    Numbers like this are called happy.
    Not all numbers are happy. If we started with 11, the sequence would be:
        11 -> 2 -> 4 -> 16 -> ...
    This sequence will never reach 1, and so the number 11 is called unhappy.
    Given a positive whole number, you have to determine whether that number is happy or unhappy.
        Examples
            happy(203) ➞ true
            happy(11) ➞ false
            happy(107) ➞ false
        Notes
            You can assume (and it is actually true!) that all positive whole numbers are either happy or unhappy.
            Any happy number will have a 1 in its sequence, and every unhappy number will have a 4 in its sequence.
            The only numbers passed to your function will be positive whole numbers.
     */

    public static void main(String[] args) {
        System.out.println(happy(100));
        System.out.println(happy(101));
        System.out.println(happy(102));
        System.out.println(happy(103));
        System.out.println(happy(104));
        System.out.println(happy(105));
        System.out.println(happy(106));
        System.out.println(happy(107));
        System.out.println(happy(108));
        System.out.println(happy(109));
        System.out.println(happy(110));
    }


    public static boolean happy(int num) {

        boolean isHappy = false;
        int sum = 0;
        int digit = 0;

        do {
            while (num > 0) {
                digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
            sum = 0;

            if (num == 1) {
                isHappy = true;
                break;
            } else if (num == 4) {
                isHappy = false;
                break;
            }

        } while (true);

        return isHappy;
    }

}
