import java.util.Scanner;
public class ornek6100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int sayiToplam=0;
        for (int i = 1; i < sayi; i++) { //girilen sayı hariç o sayıya kadar olan sayılarla girilen sayı tam bölünüyorsa bunu tut
            if(sayi%i==0){
                sayiToplam +=i; //tutulan sayıları her defasında topla
            }
        }
        if (sayiToplam<sayi*2){  //eksik sayı durumunu kontrol et
            sayi = (sayi*2) -sayiToplam;
            System.out.println("Eksik sayıdır. Eksiklik miktarı: "+sayi);
        }
        else {
            System.out.println("Eksik sayı değildir");
        }

    }
}
