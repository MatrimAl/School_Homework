import java.util.Scanner;
import java.util.*;
public class ornek683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğru parçasının uzunluğunu giriniz");
        int ab = input.nextInt(); //uzunluğu al
        double cb = 2*(ab/(1+Math.pow(5,0.5))); //cb yi bulmak için formülü uygula
        double ac = ab-cb; //cb den ilerleyerek kalan uzunluğu bul
        System.out.println("Altın orana göre bölünen 2 uzunlık AC: "+ac+" CB: "+cb);

    }
}