package lambdaExpressions.arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
     /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Array kaclik olsun");
        int arrBoy = scan.nextInt();
        int[] arr = new int[arrBoy];

        for (int i = 0; i < arrBoy; i++) {
            System.out.println( (i +1) + ". elemanı gir");
            arr[i] = scan.nextInt();
        }

        int sonuc = Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();

        System.out.println();


















    }
}
