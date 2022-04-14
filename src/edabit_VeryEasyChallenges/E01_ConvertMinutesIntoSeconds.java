package edabit_VeryEasyChallenges;

public class E01_ConvertMinutesIntoSeconds {
    public static void main(String[] args) {
        /*
        Write a function that takes an integer minutes and converts it to seconds.

        Examples
        convert(5) ➞ 300

        convert(3) ➞ 180

        convert(2) ➞ 120
         */

        int result1 = convertMinuteToSecond(5);
        int result2 = convertMinuteToSecond(3);
        int result3 = convertMinuteToSecond(2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    private static int convertMinuteToSecond(int minute) {

        int second = minute*60;

        return second;
    }
}
