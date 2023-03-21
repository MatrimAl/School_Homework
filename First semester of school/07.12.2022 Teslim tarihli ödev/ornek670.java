import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Derece giriniz");
        double derece = input.nextDouble();
        System.out.println("Terim sayısı giriniz");
        double terim = input.nextDouble();
        double sonuc = 0;
        double faktoriyel = 1;
        for (double i = 1; i <= terim; i++) {
            for (int j = 1; j <= (i*2)-1; j++) {
                faktoriyel = (j)*faktoriyel;
            }
            sonuc = sonuc + ((( Math.pow(-1, i-1)) * Math.pow(derece, ((2*i)-1))/faktoriyel));
            faktoriyel = 1;
        }

        System.out.println("İşlem sonucu: "+ sonuc);
    }
}