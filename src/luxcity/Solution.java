package luxcity;

import java.util.*;

public class Solution {
    /**
     * Implement method fourLetters
     */
    public static int fourLetters(String names) {
        String[] namesArr = names.split(" ");
        int counter = 0;
        for (String w: namesArr
             ) {
            if(w.split("").length==4){
             counter++;
            }
        }
        return counter;
    }

    public static int getResultFood(List<Integer> food) {

        //food = [10, 2, 7, 7, 2]
        int sum = 0;
        boolean flag = false;

        if (food.size()==1) return 0;

        for (int i = 0; i < food.size(); i++) {
            if(i>0) {
                for (int j = 0; j < i; j++) {
                    if (food.get(j).equals(food.get(i))) {
                        flag = true;
                    }
                }

                if (!flag){
                    sum += food.get(i);
                }
                flag = false;

            } else {
                sum += food.get(i);
            }
        }

        return sum;
    }

    public static List<Integer> getResultTetris(List<Integer> arrayTetris, int k) {

        //[4, 2, 3, 1, 3]
        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arrayTetris.size(); i++) {
            yeniList.add(0);
        }
        for (int i = 0; i < arrayTetris.size() ; i++) {
            yeniList.add(0);
            if (k>0 && arrayTetris.get(i)==0){
                yeniList.set(i,yeniList.get(i)+1);
                k--;
            }
        }

        int max = arrayTetris.stream().reduce(Math::max).get();
        int toplam = 0;
        if (k>0) {
            toplam = arrayTetris.stream().reduce(Math::addExact).get();
        }


        return yeniList;

    }

    public static void main(String[] args) {
        System.out.println(fourLetters("Tror Gvigris Deriana Nori"));
        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        Integer[] arr = {10, 2, 7, 7, 2,9,1};
        List<Integer> food = Arrays.asList(arr);
        System.out.println(getResultFood(food));
        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        int k =2;
        List<Integer> array_tetrisList = new ArrayList<>();
        array_tetrisList.add(0);
        array_tetrisList.add(2);
        array_tetrisList.add(1);
        array_tetrisList.add(0);
        System.out.println(getResultTetris(array_tetrisList, k));

    }
}
