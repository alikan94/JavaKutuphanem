package edabit_MediumChallenges;

public class E01_HowManySolutionsDoesThisQuadraticHave {
    /*
    How Many Solutions Does This Quadratic Have?

    A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.
    Examples

    solutions(1, 0, -1) ➞ 2
    // x² - 1 = 0 has two solutions (x = 1 and x = -1).

    solutions(1, 0, 0) ➞ 1
    // x² = 0 has one solution (x = 0).

    solutions(1, 0, 1) ➞ 0
    // x² + 1 = 0 has no real solutions.

    Notes

    You do not have to calculate the solutions, just return how many there are.
    a will always be non-zero.
     */
    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
        System.out.println(solutions(200, 420, 800));
        System.out.println(solutions(200, 420, -800));
        System.out.println(solutions(1000, 1000, 0));
        System.out.println(solutions(10000, 400, 4));

    }

    public static int solutions(int a, int b, int c) {

        int discriminant = (b*b) - (4*a*c);

        if (discriminant>0) return 2;
        else if (discriminant==0) return 1;
        else return 0;

        // return (discriminant == 0) ? 1 : (discriminant > 0) ? 2 : 0;

    }

    // other solutions
    // 1

    public static int solutions2(int a, int b, int c) {
        int discrim = (int)Math.pow(b, 2) - 4 * a *  c;
        return (discrim == 0) ? 1 : (discrim < 0) ? 0 : 2;
    }
}
