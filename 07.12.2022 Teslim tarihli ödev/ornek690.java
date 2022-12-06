import java.util.Scanner;
public class ornek690 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Asal sayıları sıralamak için üst sınırı belirleyin");
        int n = input.nextInt(); //kullanıcıdan üst sınırı al
        int kontrol;
        int kontrol2;
        for (int i = 2; i <=n ; i++) { //üst sınıra kadar sayıları teker teker al
            kontrol =0;
            kontrol2=0;
            for (int j = 2; j < i ; j++) { //alınan sayıların bölünme durumunu kontrol et
                if(i%j==0){
                    kontrol =1;
                    break;
                }
            }
            if(kontrol==0){
                for (int j = 2; j < i ; j++) { //alınan asal sayının 2-2 fazlasının asal durumunu kontrol et
                    if((i+2)%j==0){
                        kontrol2 =1;
                        break;
                    }
                }
                if (kontrol2==0 && i != 2){ //uygunsa çıktı ver
                    System.out.println(i+2);
                }

            }


        }

    }
}
