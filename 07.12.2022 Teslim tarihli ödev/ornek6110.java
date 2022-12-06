import java.util.Scanner;

public class ornek6110 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //terim sayısı al
        int k0=0;
        int k1=1;
        System.out.println(k1);
        for (int i = 1; i <= n-1; i++) { //terim sayısı kadar formülü döndür
            int k2=34*k1-k0+2; // formülü uygula
            System.out.println(k2); //çıktı ver "Kara üçgensel sayılar"
            k0=k1;
            k1=k2;
        }
    }
}
