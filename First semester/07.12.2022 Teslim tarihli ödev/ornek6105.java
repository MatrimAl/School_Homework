import java.util.Scanner;
public class ornek6105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int s = 0;
        int t = 0;
        double sonuc;
        int sonucTam;
        for (int i = 1; i <a ; i++) { //aritmatik sayı işlemlerini uygula
            if(a%i==0){
                t+=i;
                s++;
            }
        }
        sonuc=t/s;
        sonucTam= (int) sonuc; //sonucu tam sayıya yuvarlanmış değere ata
        if(sonucTam==sonuc){ // tam sayı mı kontrol et
            System.out.println("Aritmatik sayıdır");
        }
        else {
            System.out.println("Aritmatik sayı değildir.");
        }
    }
}
