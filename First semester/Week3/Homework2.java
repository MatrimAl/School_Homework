/*
Kullanıcıdan 1 ile 7 arasında bir sayı al
Eğer sayı 1 ise gün pazartesi
Eğer sayı 2 ise gün salı
Eğer sayı 3 ise çarşamba
Eğer sayı 4 ise perşembe
Eğer sayı 5 ise cuma
Eğer sayı 6 ise cumartesi
Eğer sayı 7 ise pazar

*/
import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 7 arasında bir sayı giriniz.");
        int gün = input.nextInt();
        if (gün == 1){System.out.println("Pazartesi");}
        else if (gün == 2){System.out.println("Salı");}
        else if (gün == 3){System.out.println("Çarşamba");}
        else if (gün == 4){System.out.println("Perşembe");}
        else if (gün == 5){System.out.println("Cuma");}
        else if (gün == 6){System.out.println("Cumartesi");}
        else if (gün == 7){System.out.println("Pazar");}
        else{System.out.println("Hatalı giriş.");}
    }
    
}
