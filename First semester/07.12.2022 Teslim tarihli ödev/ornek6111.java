import java.util.Scanner;

public class ornek6111 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //terim sayısı al
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= 10 ; i++) { // terim sayısı kadar döngüyü döndür
            System.out.println(c); //Fibanocci sayı formülü uygula ve çıktı ver
            a = b + c;
            c = b;
            b = a;
        }
    }
}
