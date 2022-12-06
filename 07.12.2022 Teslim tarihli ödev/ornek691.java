import java.util.Scanner;
public class ornek691 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int sayiToplam=0;
        for (int i = 1; i < sayi; i++) { //girilen sayı hariç o sayıya kadar olan sayılarla girilen sayı tam bölünüyorsa bunu tut
            if(sayi%i==0){
                sayiToplam +=i; //tutulan sayıları her defasında topla
            }
        }
        if (sayi==sayiToplam){  //eşitse uygun çıktısı ver
            System.out.println("Sayı, mükemmel sayıdır");
        }
        else {
            System.out.println("Sayı, mükemmel sayı değildir.");
        }

    }
}
