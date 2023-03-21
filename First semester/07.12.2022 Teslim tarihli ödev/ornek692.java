import java.util.Scanner;
import java.util.*;
public class ornek692 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt(); //üst sınırı belirleyeek olan sayıyı al
        double a;
        double b;
        int sayac=0;
        for (int i = 0; i < sayi; i++) { //sayıları teker teker al
            a = Math.pow(2,i);
            b = Math.pow(2,i+1)-1;
            for (int j = 1; j <=b ; j++) { //b nin asal olma durumunu kontrol et
                if (b%j==0){
                    sayac++;
                }
            }
            if (sayac == 2){ //b asal ise çıktı ver
                System.out.println(a*b);
            }
            sayac=0;
        }
    }
}
