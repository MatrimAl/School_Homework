import java.util.Scanner;
public class ornek682 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //bölüm sayısını al
        int t = 1;
        int sonuc;
        for (int i = 1; i <n ; i++) { //bölüm sayısı kadar işlemi uygula
            t=4+1/t;
        }
        sonuc = 2+1/t; //istisna işlemi uygula
        System.out.println("İşlem sonucu: "+sonuc); //çıktı ver
    }
}