import java.util.Scanner;
import java.util.*;
public class ornek677 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısı giriniz");
        double terim = input.nextDouble(); // terim sayısını al
        double sonuc = 0;
        double faktoriyel = 1;
        for (double i = 0; i <= terim; i++) { //0 dan başlayıp girilen terim sayısına kadar işlme ypaılır

            sonuc = sonuc + Math.pow(-1, i)/((2*i+1)*Math.pow(3, i)); //formülü uygula
        }
        sonuc = Math.pow(12, (1/2)*sonuc);

        System.out.println("pi değeri: "+ sonuc); // çıktı ver
    }
}