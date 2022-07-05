package edabit_ExpertChallanges;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class KaprekarsConstant {
    /*
    6174 is known as one of Kaprekar's constants, after the Indian mathematician D. R. Kaprekar.
    Number 6174 is notable for the following rule:

    Take any four-digit number, using at least two different digits (leading zeros are allowed).
    Arrange the digits in descending and then in ascending order to get two four-digit numbers,
    adding leading zeros if necessary.
    Subtract the smaller number from the bigger number.
    Go back to step 2 and repeat.

    The above process, known as Kaprekar's routine, will always reach its fixed point, 6174, in at most 7 iterations. Once 6174 is reached, the process will continue yielding 7641 – 1467 = 6174. For example, choose 3524:

    5432 – 2345 = 3087
    8730 – 0378 = 8352
    8532 – 2358 = 6174
    7641 – 1467 = 6174

    Write a recursive function that will return the number of times it will take to get
    from a number to 6174 (the above example would equal 3).

    (1)5432 – 2345 = 3087,
    (2)8730 – 0378 = 8352,
    (3)8532 – 2358 = 6174

    495 would produce the following: 4950 to 9540 - 459, 9081 to 9810 - 189, 9621 to 9621 - 1269,
    8352 to 8532 - 2358 answer: 4

    For a 2 digit number, the following would be produced (stating with number 10 -> 100):

    100 to 100 - 1, 990 to 990 - 99, 8910 to 9810 - 189, 9621 to 9621 - 1269, 8352 to 8532 - 2358 answer: 5
    Examples

    kaprekar(6621) ➞ 5

    kaprekar(6554) ➞ 4

    kaprekar(1234) ➞ 3

    Notes

    If the subtracted number is less than 1000, add an extra zero to that number.
    The number 1111 will equal 0000, so this number (1111) is invalid.
    If you're still unclear, please check the comments section.
     */

    static int sayac = 0;
    static int kaprekarConstant = 6174;

    public static int kaprekar(int num) {
        sayac++;
        String[] arrString = ((Integer) num).toString().split("");
        List<String> listString = new ArrayList<>();
        listString.addAll(Arrays.asList(arrString));

        while (listString.size() < 4) {
            listString.add("0");
        }

        listString = listString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        String buyukSayiString = "";
        for (String each : listString
        ) {
            buyukSayiString += each;
        }
        int buyukSayiInt = Integer.parseInt(buyukSayiString);

        listString = listString.stream().sorted().collect(Collectors.toList());

        String kucukSayiString = "";
        for (String each : listString
        ) {
            kucukSayiString += each;
        }
        int kucuksayiInt = Integer.parseInt(kucukSayiString);

        int fark = buyukSayiInt - kucuksayiInt;
        if (fark == kaprekarConstant) {
            int temp = sayac;
            sayac = 0;
            return temp;
        }

        return kaprekar(fark);
    }

    public static void main(String[] args) {
        System.out.println(kaprekar(1112));
        System.out.println(kaprekar(456));
        System.out.println(kaprekar(76));
        System.out.println(kaprekar(100));
        System.out.println(kaprekar(101));
        System.out.println(kaprekar(5432));

    }

    // other solutions
    // 1

    public static int kaprekar2(int num) {
        int count = 0;
        while (num != 6174){
            char[] cArr = String.format("%04d", num).toCharArray();
            Arrays.sort(cArr);
            num = Integer
                    .parseInt(new StringBuilder(String.valueOf(cArr)).reverse().toString()) - Integer.parseInt(String.valueOf(cArr));
            count++;
        }
        return count;
    }

    // 2

    public static int kaprekar3(int num) {
        int kaprekarCount = 0;
        while(num != 6174){
            num = kaprekarForm(num);
            kaprekarCount++;
        }
        return kaprekarCount;
    }

    public static int kaprekarForm(int num){
        String numBroken = Integer.toString(num);
        String[] stringArr = numBroken.split("");
        int [] numArr = new int[4];
        for (int i = 0; i < stringArr.length; i++){
            numArr[i] = Integer.parseInt(stringArr[i]);
        }
        Arrays.sort(numArr);
        String smaller = "" + numArr[0] + numArr[1] + numArr[2] + numArr[3];
        String bigger = "" + numArr[3] + numArr[2] + numArr[1] + numArr[0];
        int biggerInt = Integer.parseInt(bigger);
        int smallerInt = Integer.parseInt(smaller);
        return biggerInt - smallerInt;
    }
}
