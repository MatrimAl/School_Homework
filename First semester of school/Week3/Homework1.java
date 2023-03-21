/* 
Number1 al
Eğer Number1>0 ise sayı pozitif çıktısı ver
Eğer Number1<0 ise sayı negatif çıktısı ver
Eğer Number1=0 ise sayı sıfır çıktısı ver
*/
import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Sayı giriniz.");
         int number1 = input.nextInt();
         if (number1>0){System.out.println("Sayı pozitif");}
         else if (number1<0){System.out.println("Sayı negatif");}
         else {System.out.println("Sayı 0");}
    }
    
}
