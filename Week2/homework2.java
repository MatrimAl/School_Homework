/* 
Adım 1: Açı derecesini kullanıcıdan al
Adım 2: Radyan formülü X * n/180
Adım 3: 
Adım 4: Cevabın çıktısını kullanıcıya ver.
*/
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Açı derecesini giriniz: ");
        double derece = input.nextInt();
        
        double radyan = derece /180;
        System.out.println("Radyan cinsinden değer: " + radyan );
        
      
    }
    
}
