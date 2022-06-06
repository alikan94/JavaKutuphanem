package edabit_VeryHardChallenges;

public class E03_AtbashCipher {
    public static void main(String[] args) {

        System.out.println(atbash("alikan"));
        System.out.println(atbash("seyma"));
        System.out.println(atbash("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(atbash("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi."));
        System.out.println(atbash("The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet."));
    }
    public static String atbash(String str) {
        String newStr = "";
        //Ascii A=65 Z=90 toplam = 155
        //Ascii a=97 z=122 toplam = 219
        int kucukHarfAsciiToplam = 219;
        int buyukHarfAsciiToplam = 155;

        String [] charArr = str.split("");

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i].charAt(0)<='z'&&charArr[i].charAt(0)>='a'){
                charArr[i]=Character.toString((char)(kucukHarfAsciiToplam-(charArr[i].charAt(0))));
                newStr+=charArr[i];
            } else if (charArr[i].charAt(0)<='Z'&&charArr[i].charAt(0)>='A'){
                charArr[i]=Character.toString((char)(buyukHarfAsciiToplam-(charArr[i].charAt(0))));
                newStr+=charArr[i];
            } else {
                newStr+=charArr[i];
            }
        }

        return newStr;
    }

    // alternatif cozum
    public static String atbash2(String str) {

        return str.chars()
                .map(cp -> Character.isUpperCase(cp) ? 'Z' - (cp - 'A')
                        : Character.isLowerCase(cp) ? 'z' - (cp - 'a') : cp)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
