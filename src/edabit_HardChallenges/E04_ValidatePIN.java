package edabit_HardChallenges;

public class E04_ValidatePIN {
    public static void main(String[] args) {

        //Create a function that will test if a string is a valid PIN or not via a regular expression.
        //
        //A valid PIN has:
        //
        //Exactly 4 or 6 characters.
        //Only numeric characters (0-9).
        //No whitespace.
        //Examples
        //validate("121317") ➞ true
        //
        //validate("1234") ➞ true
        //
        //validate("45135") ➞ false
        //
        //validate("89abc1") ➞ false
        //
        //validate("900876") ➞ true
        //
        //validate(" 4983") ➞ false

        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1"));
        System.out.println(validate("900876"));
        System.out.println(validate(" 4983"));
        System.out.println(otherIsValidateMethod("15632 "));

    }

    public static boolean validate(String pin) {
        boolean isValidate = false;

        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (!(pin.charAt(i) <= 'z' && pin.charAt(i) >= 'A')) {
                    isValidate = true;
                }
                if (pin.charAt(i) <= 'z' && pin.charAt(i) >= 'A') {
                    isValidate = false;
                    break;
                }
                if (pin.charAt(i) == ' ') {
                    isValidate = false;
                    break;
                }
            }
        }

        return isValidate;
    }
    public static boolean otherIsValidateMethod(String p) {
        // ikinci bir cozum sekli:
        return p.matches("\\d{4}|\\d{6}");
    }
}
