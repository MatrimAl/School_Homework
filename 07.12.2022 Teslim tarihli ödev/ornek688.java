import java.util.Scanner;
public class ornek688 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int Sayi = input.nextInt();

        System.out.println("Cevap :");
        for (int i = 2; i < Sayi; i++) { //sayinin asal bölenlerini bulmak için girilen sayıya kadar böl
            while (Sayi % i == 0) {
                System.out.println(i + " ");
                Sayi = Sayi / i;
            }
        }
        if (Sayi > 2) { // sadece kendisine bölünebiliyorsa
            System.out.println(Sayi);
        }
    }
}