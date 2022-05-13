package interviewQuestions1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q01_CountsOfCharacters {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine().replaceAll("\\s","");

        String[] charactersArr = str.split("");
        Arrays.sort(charactersArr);
        int counter=1;
        for (int i = 1; i < charactersArr.length; i++) {
            if (charactersArr[i-1].equals(charactersArr[i])){
                counter++;
            } else {
                System.out.print(charactersArr[i-1] + "=" + counter + " ");
                counter = 1;
            }

        }

    }

}
