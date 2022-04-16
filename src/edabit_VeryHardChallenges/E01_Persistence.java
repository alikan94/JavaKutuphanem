package edabit_VeryHardChallenges;

public class E01_Persistence {

    public static void main(String[] args) {
        //The additive persistence of an integer, n,
        // is the number of times you have to replace n with the sum of its digits until n becomes
        // a single digit integer.
        //
        //The multiplicative persistence of an integer, n, is the number of times you have to replace
        // n with the product of its digits until n becomes a single digit integer.
        //
        //Create two functions that take an integer as an argument and:
        //
        //Return its additive persistence.
        //Return its multiplicative persistence.
        //Examples: Additive Persistence
        //additivePersistence(1679583) ➞ 3
        //// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
        //// 3 + 9 = 12
        //// 1 + 2 = 3
        //// It takes 3 iterations to reach a single-digit number.
        //
        //additivePersistence(123456) ➞ 2
        //// 1 + 2 + 3 + 4 + 5 + 6 = 21
        //// 2 + 1 = 3
        //
        //additivePersistence(6) ➞ 0
        //// Because 6 is already a single-digit integer.
        //Examples: Multiplicative Persistence
        //multiplicativePersistence(77) ➞ 4
        //// 7 x 7 = 49
        //// 4 x 9 = 36
        //// 3 x 6 = 18
        //// 1 x 8 = 8
        //// It takes 4 iterations to reach a single-digit number.
        //
        //multiplicativePersistence(123456) ➞ 2
        //// 1 x 2 x 3 x 4 x 5 x 6 = 720
        //// 7 x 2 x 0 = 0
        //
        //multiplicativePersistence(4) ➞ 0
        //// Because 4 is already a single-digit integer.

        int result1 = additivePersistence(5);
        int result2 = additivePersistence(27);
        int result3 = additivePersistence(58);
        int result4 = additivePersistence(5789);
        long result5 = multiplicativePersistence(7);
        long result6 = multiplicativePersistence(1234567890);
        long result7 = multiplicativePersistence(39);
        long result8 = multiplicativePersistence(6788);
        long result9 = multiplicativePersistence(277777788888899L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);

    }

    public static int additivePersistence(int input) {

        int counterAdd = 0;
        int result = 0;

        if (counterAdd == 0) {
            if (input < 10) {
                return counterAdd;
            }
        }
        while (input > 0) {
            result += input % 10;
            input /= 10;
        }
        counterAdd++;
        if (result >= 10) {
            result = additivePersistence(result, counterAdd);
        } else {
            return counterAdd;
        }
        return counterAdd;
    }

    public static int additivePersistence(int input, int counterAdd) {
        int result = 0;
        while (input > 0) {
            result += input % 10;
            input /= 10;
        }
        counterAdd++;
        if (result >= 10) {
            result = additivePersistence(result, counterAdd);
        } else {
            return counterAdd;
        }
        return result;
    }

    public static long multiplicativePersistence(long input) {
        int counterMulti = 0;
        long result = 1;
        if (counterMulti == 0) {
            if (input < 10) {
                return counterMulti;
            }
        }

        while (input > 0) {
            result *= input % 10;
            input /= 10;

        }
        counterMulti++;
        if (result >= 10) {
            result = multiplicativePersistence(result,counterMulti);
        } else {
            return counterMulti;
        }
        return result;
    }

    public static long multiplicativePersistence(long input,int counterMulti) {
        long result = 1;
        while (input > 0) {
            result *= input % 10;
            input /= 10;

        }
        counterMulti++;
        if (result >= 10) {
            result = multiplicativePersistence(result,counterMulti);
        } else {
            return counterMulti;
        }
        return result;

    }


}
