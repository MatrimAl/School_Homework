/* 
Adım 1: kürenin yarıçapını kullanıcıdan al
Adım 2: Pi'yi 3 kabul eden bir yazı yolla
Adım 3: Kürenin  hacmi formülü: V = 4/3nr^3
Adım 4: Kürenin alanı formülü: 4n.r2
Adım 4: Cevabın çıktısını kullanıcıya ver.
*/
import java.util.Scanner;
public class homework3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pi 3 olarak kabul edilecektir: ");
        System.out.println("Kürenin yarıçapını giriniz: ");
        int küreYarıçap = input.nextInt();
        
        int küreHacim = 4*(küreYarıçap*küreYarıçap*küreYarıçap);
        
        int  küreAlan = 4*3*küreYarıçap*2;
        
        System.out.println("Kürenin Hacmi: " + küreHacim);
        
        System.out.println("Kürenin Alanı: " + küreAlan);
    }
    
}
