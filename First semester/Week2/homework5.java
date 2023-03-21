/*
Adım 1: Kullanıcıdan Akım değerini al 
Adım 2: Kullanıcıdan Direnç değerini al
Adım 3: Gerilim = Akım * Direnç
Adım 4: Çıktıyı kullanıcıya ver 

*/
import java.util.Scanner;

public class homework5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Akım değerini giriniz: ");
        double Akım = input.nextDouble();
        System.out.println("Direnç değerini giriniz: ");
        double Direnç = input.nextDouble();
        
        double Gerilim = Akım * Direnç;
        System.out.println("Gerilim değeri: " + Gerilim);
        
    }
    
}
