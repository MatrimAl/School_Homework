/*
Adım 1: Kullanıcıdan kütle değerini al 
Adım 2: Kullanıcıdan hız değerini al
Adım 3: Kullanıcıdan yerden yüksekliğin değerini al
Adım 4: Potansiyel enerji = kütle * yer çekimi * yerden yükseklik
Adım 5: Kinetik enerji = 1/2 * kütle * hız^2
Adım 6: Kullanıcıya çıktıyı ver 
*/
import java.util.Scanner;

public class homework4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yer çekimi 10 olarak kabul edilecektir");
        System.out.println("Kütle değerini giriniz: ");
        double kütle = input.nextDouble();
        System.out.println("Hız değerini giriniz: ");
        double hız = input.nextDouble();
        System.out.println("Yerden yükseklik değerini giriniz: ");
        double yerdenYükseklik = input.nextDouble();
        
        double enerjiPotansiyel = kütle * hız * yerdenYükseklik;
        double enerjiKinetik =  (kütle * (hız*hız))/2;
        
        System.out.println("Potansiyel enerji değeri: " + enerjiPotansiyel);
        System.out.println("Kinetik enerji değeri: " + enerjiKinetik);
        
    }
    
}
