import java.util.Random;
import java.util.Scanner;
public class ornek673
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String tahmin;
        int x = random.nextInt(25)+65;
        String harf = String.valueOf(Character.toChars(x));
        int tahminHak = 10;
        while(true){
            System.out.println("Tahmini harfinizi büyük harf olacak şekilde girinz. Kalan tahmin hakkınız: "+tahminHak);
            tahmin = input.nextLine();
            if(harf.equals(tahmin)){
                System.out.println("Doğru tahmin.");
                break;
            }
            else if(tahminHak==0){
                System.out.println("Tahmin hakkınız bitti kaybettiniz.");
                break;

            }
            else{
                System.out.println("Yanlış tahmin.");
            }
            tahminHak--;
        }
    }
}