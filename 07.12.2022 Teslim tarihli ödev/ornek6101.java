import java.util.Scanner;

public class ornek6101 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int N = input.nextInt(); //touhou sayıları için üst sınır al
            int s;
        for (int i = 1; i <= N; i++) { // üst sınıra kadar sayıları dene
            s = 0;
            for (int j = 1; j <= i; j++) { // sırayla tutulan sayıların bölünebilirliğini dene
                if(i % j == 0){
                    s++; // bölünen her durumda bölenleri 1 arttır
                }
            }
            if(i%s == 0){ //sayının bölenlerinin sayısına bölünme durumunu kontrol et
                System.out.println(i);
            }
        }
    }
}
