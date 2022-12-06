import java.util.Scanner;
public class ornek671 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sonuc = 0;
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();
        System.out.println("terim sayısını belirleyinizç");
        int terim = input.nextInt();
        for (int i = 0; i < terim; i++) { //verilen terime kadar sayıyı aç
            sonuc = sonuc + (1/sayi); //sırası gelen terimin işlemini yap
            sayi +=8; //her terim için paydayı 8 arttır
        }
        System.out.println("Ln değeri "+sonuc);
    }
}