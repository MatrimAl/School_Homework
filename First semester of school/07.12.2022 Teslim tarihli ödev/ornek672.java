import java.util.Random;
import java.util.Scanner;
public class ornek672
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int tahminUser;
        int tahminToplam;
        int x = random.nextInt(98)+1;
        while(true){
            System.out.println("Tahmini sayınızı girinz.");
            tahminUser = input.nextInt();
            if(tahminUser>x){
                System.out.println("Daha küçük sayı tahmin ediniz");
            }
            else if(x>tahminUser){
                System.out.println("Daha büyük sayı tahmin ediniz.");
            }
            else if(x==tahminUser){
                System.out.println("Doğru tahmin. Toplam deneme: "+tahminToplam);
                break;
            }
            tahminToplam++;

        }
    }
}