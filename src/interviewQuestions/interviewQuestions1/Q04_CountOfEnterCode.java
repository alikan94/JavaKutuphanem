package interviewQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // giris hakki 4
    //

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin = "said.12345";
        int girisHakki = 4;
/*
        System.out.println("*****Hosgeldiniz*****");
        while(true){
            System.out.print("pin kodu giriniz : ");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz..:)");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz :"  + girisHakki);
            }if(girisHakki==0){
                System.out.println("giris hakkiniz kalmadi.. sim kartiniz bloke oldu..");
                break;
            }

        }

 */
        System.out.println("Sisteme Hosgeldiniz");
        while (true) {
            System.out.println("Lutfen pin girisi yapin");
            String girilenPin = scan.nextLine();
            if (girisHakki > 0) {
                if (girilenPin.equals(pin)) {
                    System.out.println("basari ile girdiniz");
                    break;
                } else {
                    System.out.println("hatali giris");
                    girisHakki--;
                    System.out.println("giris hakkiniz = " + girisHakki);
                    if (girisHakki == 0) {
                        System.out.println("giris hakkiniz kalmadi haci abim");
                        System.out.println("kart bloke oldu gecmisler olsun");
                        break;
                    }
                }
            }
        }

    }

}
