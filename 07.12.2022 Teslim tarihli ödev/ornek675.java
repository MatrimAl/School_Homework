import java.util.Scanner;

public class ornek675 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("X değerini giriniz.");  // X değerini al
        double x = input.nextDouble();
        System.out.println("n değerini giriniz."); // n değerini al
        double n = input.nextDouble();
        double sonuc = Math.pow(1+(x/n), n); //formüle yerleştir ve uygula
        System.out.println("İşlem sonucu: "+sonuc);
    }
}