package edabit_HardChallenges;

public class E01_SevenBoom {
    public static void main(String[] args) {
        int[] arr1 = {1, 7};
        int[] arr2 = {4};
        int[] arr3 = {71};
        sevenBoom(arr1);
        sevenBoom(arr2);
        sevenBoom(arr3);
    }

    public static String sevenBoom(int[] arr) {
        boolean isThereSeven = false;

        for (int i = 0; i < arr.length; i++) {

            while (arr[i]>0){
                if(arr[i]%10==7){
                    isThereSeven = true;
                    break;
                } else {
                    arr[i]/=10;
                }
            }

        }

        if (isThereSeven) {
            return "Boom!";
        } else {
            return "there is no 7 in the array";
        }


    }
}
