package interviewQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();

        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        System.out.println("Yeni kelimeniz : "+ilkVeSonHarfiDondur(str, sayi));
    }

    private static String ilkVeSonHarfiDondur(String str, int sayi) {
        String temp = str.charAt(0) + "" + str.charAt(str.length()-1);

        /*  StringBuilder output= new StringBuilder();
            output.append(temp.repeat(Math.max(0, sayi)));
            return output.toString();*/

        // repeat tekrar tekrar yazdiriyor.
        // çok iyi beeee

        return temp.repeat(Math.max(0, sayi));
    }

}
