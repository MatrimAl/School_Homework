import java.util.Scanner;
public class ornek681 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //bölüm sayısını al
        int t = 1;
        int sonuc;
        for (int i = 1; i <n-1 ; i++) { //bölüm sayısı kadar işlemi uygula
            t=1+1/(2+1/t);
        }
        sonuc = 1+1/t; //istisna işlemi uygula
        System.out.println("İşlem sonucu: "+sonuc); //çıktı ver
    }
}