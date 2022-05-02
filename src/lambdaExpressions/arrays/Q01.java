package lambdaExpressions.arrays;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */

        int[][] input = {{10,20,30},{4},{6,7,20}};
        Integer[] newArr=multiArrayiDuzArrayaCevir(input);

        System.out.println(Arrays.toString(newArr));

    }

    private static Integer[] multiArrayiDuzArrayaCevir(int[][] input) {

        return Arrays.stream(input).
                map(t-> Arrays.
                        stream(t).
                        sum()).
                toArray(Integer[]::new);
    }
}
