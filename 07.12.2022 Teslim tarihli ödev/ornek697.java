import java.util.Scanner;
public class ornek697 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int bToplam=0;
        int aToplam=0;
        for (int i = 1; i < a; i++) { //girilen sayı hariç o sayıya kadar olan sayılarla girilen sayı tam bölünüyorsa bunu tut
            if(a%i==0){
                aToplam +=i; //tutulan sayıları her defasında topla
            }
        }
        for (int i = 1; i < b; i++) { //girilen sayı hariç o sayıya kadar olan sayılarla girilen sayı tam bölünüyorsa bunu tut
            if(b%i==0){
                bToplam +=i; //tutulan sayıları her defasında topla
            }
        }
        if (bToplam==aToplam){  //eşitse uygun çıktısı ver
            System.out.println("Sayıöar, dost sayıdır");
        }
        else {
            System.out.println("Sayılar, dost sayı değildir.");
        }

    }
}
