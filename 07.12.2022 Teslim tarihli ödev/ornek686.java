import java.util.Scanner;
public class ornak686 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Asal sayıları sıralamak için üst sınırı belirleyin");
        int n = input.nextInt(); //kullanıcıdan üst sınırı al
        int kontrol;
        for (int i = 2; i <=n ; i++) { //üst sınıra kadar sayıları teker teker al
            kontrol =0;
            for (int j = 2; j < i ; j++) { //alınan sayıların bölünme durumunu kontrol et
                if(i%j==0){
                    kontrol =1;
                    break;
                }
            }
            if(kontrol==0){
                System.out.println("Asal sayı: "+i); //bölünme durumu false ise yazdır
            }

        }

    }
}
