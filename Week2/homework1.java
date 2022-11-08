/* 
Adım 1: Kullanıcıdan üçgenin kenar uzunluğunu al
Adım 2: Kullanıcıdan alınan kenara ait yüksekliği al
Adım 3: Üçgenin alan formülü (Kenar x Alınan kenara ait yükseklik) / 2
Adım 4: Cevabın çıktısını kullanıcıya ver.
*/
import java.util.Scanner;

public class homework1 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Üçgenin kenar uzunluğunu giriniz: ");
         int üçgenKenar = input.nextInt();
         System.out.println("Üçgenin kenar uzunluğuna ait yüksekliği giriniz: ");
         int üçgenYükseklik = input.nextInt();
         
         int üçgenAlan = (üçgenKenar * üçgenYükseklik) / 2;
         
         System.out.println("Üçgenin Alanı: " + üçgenAlan);
     }
}
