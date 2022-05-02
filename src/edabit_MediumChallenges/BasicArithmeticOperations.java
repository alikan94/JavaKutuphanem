package edabit_MediumChallenges;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        /*
        Write a function that does the following for the given values:
        add, subtract, divide and multiply.
        These are simply referred to as the basic arithmetic operations.
        The variables have to be defined, but in this challenge they will be defined for you.
        All you have to do is check the variables, do some string to integer conversions,
        use some if conditions, and apply the arithmetic operation.

        Examples
        operation("1",  "2",  "add" ) ➞ 3
        operation("4",  "5",  "subtract") ➞ -1
        operation("6",  "3",  "divide") ➞ 2

            The numbers and operation are given as strings and should result in an integer value.
    If the operation results in an ArithmeticException, then return Integer.MIN_VALUE (e.g. division by zero).
    Division results will be rounded down to its integral part.
         */
        System.out.println(operation("1", "2", "add"));
        System.out.println(operation("4", "5", "subtract"));
        System.out.println(operation("6", "3", "divide"));
    }

    public static int operation(String a, String b, String op) {

        int result=0;

        switch (op) {
            case "add":
                result= Integer.parseInt(a) + Integer.parseInt(b);
            break;
            case "subtract":
                result= Integer.parseInt(a) - Integer.parseInt(b);
            break;
            case "divide":
                try {
                    result= Integer.parseInt(a) / Integer.parseInt(b);
                } catch (ArithmeticException e) {
                    result = Integer.MIN_VALUE;
                }
                break;
            case "multiply":
                result= Integer.parseInt(a) * Integer.parseInt(b);
            break;
            default:

        }


        return result;
    }
}
