import java.util.Scanner;

public class ornek674 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x giriniz");
        double x = input.nextDouble();
        System.out.println("Terim sayısı giriniz");
        double terim = input.nextDouble();
        double sonuc = 0;
        double faktoriyel = 1;
        for (double i = 0; i <= terim; i++) {
            for (int j = 1; j <= i; j++) {
                faktoriyel = (j)*faktoriyel;
            }
            sonuc = sonuc + ((( Math.pow(x, i))/faktoriyel));
            faktoriyel = 1;
        }

        System.out.println("İşlem sonucu: "+ sonuc);
    }
}