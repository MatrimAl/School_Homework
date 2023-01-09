import java.util.Scanner;

public class ornek689 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0){
            for(int i = 2; i < sayi+2; i++)
            {
                if(sayi+2 % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0 ){
                System.out.println("Sayı chen asalıdır.");
            }
            else {
                System.out.println("Sayı asaldır ancak chen asalı değildir");
            }
        }
        else {
            System.out.println("Sayı asal değildir");
        }

    }
}